package com.example.spring.config;

import com.example.spring.PaymentProcessor;
import com.example.spring.service.BankPaymentService;
import com.example.spring.service.PayPalPaymentService;
import com.example.spring.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentService bankPaymentService() {
        return new BankPaymentService();
    }

    @Bean
    public PayPalPaymentService payPalPaymentService() {
        return new PayPalPaymentService();
    }

    @Bean
    public PaymentProcessor paymentProcessor() {
        return new PaymentProcessor(bankPaymentService());
    }

}
