package com.johnyehyo.agentLive.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: JohnYehyo
 * @create: 2021-10-20 14:10:30
 */
@Component
public class Email {

    @Value("${mail.subject}")
    private String subject;

    @Value("${mail.from}")
    private String fromAddress;

    @Value("${mail.to}")
    private String toAddress;


    @Autowired
    private JavaMailSenderImpl javaMailSender;

    public void send(String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(subject);
        message.setFrom(fromAddress);
        message.setTo(toAddress);
        message.setText(content);
        javaMailSender.send(message);
    }
}
