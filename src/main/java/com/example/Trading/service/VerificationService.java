package com.example.Trading.service;

import com.example.Trading.domain.VerificationType;
import com.example.Trading.model.User;
import com.example.Trading.model.VerificationCode;

public interface VerificationService {

    VerificationCode sendVerificationOTP(User user, VerificationType verificationType);

    VerificationCode findVerificationById(Long id) throws Exception;

    VerificationCode findUsersVerification(User user) throws Exception;

    Boolean VerifyOtp(String opt, VerificationCode verificationCode);

    void deleteVerification(VerificationCode verificationCode);
}
