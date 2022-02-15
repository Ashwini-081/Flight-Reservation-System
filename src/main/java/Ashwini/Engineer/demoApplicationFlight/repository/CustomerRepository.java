package Ashwini.Engineer.demoApplicationFlight.repository;

import Ashwini.Engineer.demoApplicationFlight.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Customer findByUserName(String username);

//    @Query("Select user from User user where user.email=?1 and user.password=?2")
//    Customer findByUsernameAndPassword(String username, String password);



    Customer getById(String id);

}
