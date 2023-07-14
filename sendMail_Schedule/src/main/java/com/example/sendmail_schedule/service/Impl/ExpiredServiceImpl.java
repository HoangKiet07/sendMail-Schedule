package com.example.sendmail_schedule.service.Impl;

import com.example.sendmail_schedule.entity.Info;
import com.example.sendmail_schedule.repository.InfoRepository;
import com.example.sendmail_schedule.service.ExpiredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ExpiredServiceImpl implements ExpiredService {

    @Autowired
    private InfoRepository infoRepository;

    @Autowired
    private EmailSenderServiceImpl emailSenderService;

    @Override
    public String processExpried() {
        int dem = 0;
        Date date = new Date();
        List<Info> infoList = infoRepository.findAll();
        List<Info> expiredInfo = new ArrayList<>();
        for (Info info : infoList){
            if ((date.getYear()-info.getRegistrationDate().getYear())==info.getContractYear() && (info.getRegistrationDate().getMonth()-date.getMonth()) <= 3){
                dem = dem +1;
                emailSenderService.sendEmail(info.getMail(), "Hợp đồng sắp hết hạn", "Mong bạn gia hạn hợp đồng");
                expiredInfo.add(info);
            }
        }
        return "có " + dem + " hợp đồng sắp hết hạn";
    }
}
