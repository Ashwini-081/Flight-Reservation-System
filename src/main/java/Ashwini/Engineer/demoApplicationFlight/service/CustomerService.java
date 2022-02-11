package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.Customer;
import Ashwini.Engineer.demoApplicationFlight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Boolean existsById(String userName){
        return customerRepository.existsById(userName);
    }
    public Customer findCustomerByUserName(String userName){
        if(!existsById(userName)) return null;
        return customerRepository.getById(userName);
    }


}