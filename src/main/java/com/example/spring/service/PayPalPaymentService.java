package com.example.spring.service;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(String account, double amount) {
        System.out.printf("PayPal payment to account: %s with amount %.2f is successful!", account, amount);
    }
}
