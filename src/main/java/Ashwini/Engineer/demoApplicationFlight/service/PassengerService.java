//package Ashwini.Engineer.demoApplicationFlight.service;
//
//
//import Ashwini.Engineer.demoApplicationFlight.entity.Passenger;
//import Ashwini.Engineer.demoApplicationFlight.repository.PassengerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PassengerService {
//    @Autowired
//    private PassengerRepository passengerRepository;
//
//    public Passenger createCustomer(Passenger passenger){
//        return passengerRepository.save(passenger);
//    }
//
//    public Boolean existsById(String userName){
//        return passengerRepository.existsById(userName);
//    }
//    public Passenger findPassengerByUserName(String userName){
//        return passengerRepository.getById(userName);
//    }
//
//}
//
