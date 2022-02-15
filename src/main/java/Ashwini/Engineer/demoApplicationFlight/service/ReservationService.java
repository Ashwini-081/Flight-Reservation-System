package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.Reservation;
import Ashwini.Engineer.demoApplicationFlight.repository.Flight_DetailsRepository;
import Ashwini.Engineer.demoApplicationFlight.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    Flight_DetailsRepository flightRepository;

    @Autowired
    ReservationRepository reservationRepository;

    public void create(Reservation reservation) {

        reservationRepository.save(reservation);
    }

    public List<Reservation> myReservationList(String username) {
        return reservationRepository.findByCustomerUserName(username);

    }
}