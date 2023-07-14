package com.example.sendmail_schedule.repository;

import com.example.sendmail_schedule.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InfoRepository extends JpaRepository<Info, Long> {
    List<Info> findAll();
}
