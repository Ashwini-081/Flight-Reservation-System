package Ashwini.Engineer.demoApplicationFlight.repository;

import Ashwini.Engineer.demoApplicationFlight.entity.AdminLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Long> {
    AdminLogin findByUsernameAndPassword(String username, String password);

}