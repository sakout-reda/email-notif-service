package com.sakoutr.emailnotifservice.controller;

import com.sakoutr.emailnotifservice.service.EmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mail")
public class EmailSendController {
    private EmailService emailService;

    public EmailSendController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public String sendMail(String to, String[] cc, String subject, String body) {
        return emailService.sendMail( to, cc, subject, body);
    }

    @GetMapping
    public String isSecured(){
        return "Hello World";
    }

}
