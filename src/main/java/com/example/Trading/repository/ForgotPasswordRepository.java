package com.example.Trading.repository;

import com.example.Trading.model.ForgotPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken,String>  {
    ForgotPasswordToken findByUserId(Long userId);
}
