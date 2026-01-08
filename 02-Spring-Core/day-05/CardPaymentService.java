package com.example.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Default choice when multiple beans exist
@Component
@Primary
public class CardPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using CARD");
    }
}
