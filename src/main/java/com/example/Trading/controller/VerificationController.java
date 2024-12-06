package com.example.Trading.controller;

import com.example.Trading.service.EmailService;
import com.example.Trading.service.UserService;
import com.example.Trading.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    private final VerificationService verificationService;
    private final UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }

}

