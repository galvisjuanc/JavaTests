package com.jcgc.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
