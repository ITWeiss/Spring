package com.example.spring;

import com.example.spring.service.PaymentService;

public class PaymentProcessor {

    private PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void handlePayment(String account, double amount) {
        paymentService.processPayment(account, amount);
    }

}
