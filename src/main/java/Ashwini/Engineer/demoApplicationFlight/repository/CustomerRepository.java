package Ashwini.Engineer.demoApplicationFlight.repository;

import Ashwini.Engineer.demoApplicationFlight.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}