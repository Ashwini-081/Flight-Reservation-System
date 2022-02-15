package Ashwini.Engineer.demoApplicationFlight.repository;

import Ashwini.Engineer.demoApplicationFlight.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    List<Reservation> findByCustomerUserName(String username);

}