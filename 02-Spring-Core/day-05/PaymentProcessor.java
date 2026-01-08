package com.example.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

    private final PaymentService paymentService;

    // @Qualifier overrides @Primary
    public PaymentProcessor(
            @Qualifier("uPIPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process(double amount) {
        paymentService.pay(amount);
    }
}
