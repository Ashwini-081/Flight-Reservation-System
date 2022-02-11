package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.AdminLogin;
import Ashwini.Engineer.demoApplicationFlight.entity.Customer;
import Ashwini.Engineer.demoApplicationFlight.entity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AdminLoginService adminLoginService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer=customerService.findCustomerByUserName(username);
        if (customer==null){
            AdminLogin admin=adminLoginService.findByUsername(username);
            return new MyUserDetails(admin.getUsername(),admin.getPassword(),"ROLE_ADMIN");
        }

        return new MyUserDetails(customer.getUserName(),customer.getPassword(),"ROLE_USER");
    }
}
