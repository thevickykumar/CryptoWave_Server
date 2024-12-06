package com.example.Trading.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.example.Trading.domain.PaymentMethod;
import com.example.Trading.model.PaymentOrder;
import com.example.Trading.model.User;
import com.example.Trading.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProceedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
