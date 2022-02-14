package Ashwini.Engineer.demoApplicationFlight.service;

import Ashwini.Engineer.demoApplicationFlight.entity.Passanger;
import Ashwini.Engineer.demoApplicationFlight.repository.PassangerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassangerService {
    @Autowired
    private PassangerRepository passangerRepository;
    public Passanger savePassanger(Passanger passanger) {
        return passangerRepository.save(passanger);
    }


    public Passanger createPassanger(Passanger passanger){
        return passangerRepository.save(passanger);
    }

    public Boolean existsById(String email){
        return passangerRepository.existsById(email);
    }
    public Passanger findPassangerByUserName(String email){
        if(!existsById(email)) return null;
        return passangerRepository.getById(email);
    }

}
