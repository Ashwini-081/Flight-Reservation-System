package Ashwini.Engineer.demoApplicationFlight.repository;


import Ashwini.Engineer.demoApplicationFlight.entity.Flight_Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Flight_DetailsRepository extends JpaRepository<Flight_Details,Long> {
    Flight_Details getById(Integer id);

}
