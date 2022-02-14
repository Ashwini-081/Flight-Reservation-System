package Ashwini.Engineer.demoApplicationFlight.repository;

import Ashwini.Engineer.demoApplicationFlight.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,String> {
}
