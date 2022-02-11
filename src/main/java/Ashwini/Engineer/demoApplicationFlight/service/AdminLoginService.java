package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.AdminLogin;
import Ashwini.Engineer.demoApplicationFlight.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminLoginService {
    @Autowired
    private AdminLoginRepository repo;

    public AdminLogin login(String username, String password) {
        AdminLogin user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
    public AdminLogin findByUsername(String username){
        return repo.findByUsername(username);
    }

}