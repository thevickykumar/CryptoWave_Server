package com.example.Trading.service;

import com.example.Trading.model.PaymentDetails;
import com.example.Trading.model.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber,
                                            String accountHolderName,
                                            String ifsc,
                                            String bankName,
                                            User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);
}
