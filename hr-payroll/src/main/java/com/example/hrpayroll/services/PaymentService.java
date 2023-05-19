package com.example.hrpayroll.services;

import com.example.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    //Mock
    public Payment getPayment(long workerId, int days){
        return new Payment("Kauan", 200.0, days);

    }
}
