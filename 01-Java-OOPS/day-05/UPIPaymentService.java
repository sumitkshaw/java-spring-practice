package com.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class UPIPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
