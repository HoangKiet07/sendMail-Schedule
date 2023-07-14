package com.example.sendmail_schedule.service;

public interface EmailSenderService  {
    public void sendEmail(String toEmail, String subject, String body);
}
