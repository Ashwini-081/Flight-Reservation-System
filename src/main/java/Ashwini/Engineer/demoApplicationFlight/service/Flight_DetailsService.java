package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.Flight_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Flight_DetailsService  {


    List<Flight_Details>flightList() ;



    List<Flight_Details> getAllFlightDetails();

    Flight_Details saveFlight(Flight_Details flight);

    Flight_Details getFlightById(Long id);

    Flight_Details updateFlight(Flight_Details flight);

    void deleteFlightById(Long id);
    Flight_Details findById(Integer id);

}
