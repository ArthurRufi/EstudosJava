package com.example.email.model;

public interface EmailService {

    String sendMail(EmailDetails emailDetails);

    String sendMailWithAttachment(EmailDetails emailDetails) throws Exception;

}

