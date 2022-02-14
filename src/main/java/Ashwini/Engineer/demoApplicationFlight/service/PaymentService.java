package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.Payment;
import Ashwini.Engineer.demoApplicationFlight.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService {
//    private static PaymentService paymentRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    public static Payment save(Payment payment) {
        return payment;
    }


}
