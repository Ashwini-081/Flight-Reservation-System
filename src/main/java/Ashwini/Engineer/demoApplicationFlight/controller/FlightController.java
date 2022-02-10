package Ashwini.Engineer.demoApplicationFlight.controller;

import Ashwini.Engineer.demoApplicationFlight.entity.Flight_Details;
import Ashwini.Engineer.demoApplicationFlight.service.Flight_DetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlightController {
    private Flight_DetailsService flight_detailsService;

    public FlightController(Flight_DetailsService flight_detailsService) {
        super();
        this.flight_detailsService = flight_detailsService;
    }
    @GetMapping("/flights")
    public String listFlightDetails(Model model){
        model.addAttribute("flights",flight_detailsService.getAllFlightDetails());
        return "flights";

    }
    @GetMapping("/flights/new")
    public String createFlightForm(Model model){
        //to hold form data
        Flight_Details flight=new Flight_Details();
        model.addAttribute("flight",flight);
        return "create_flight";

    }

    @PostMapping("/flights")
    public String saveFlight(@ModelAttribute("flight") Flight_Details flight) {
        flight_detailsService.saveFlight(flight);
        return "redirect:/flights";
    }

    @GetMapping("/flights/edit/{id}")
    public String editFlightForm(@PathVariable Long id, Model model){
        model.addAttribute("flight",flight_detailsService.getFlightById(id));
        return "edit_flight";

    }

    @PostMapping("/flights/{id}")
    public String updateFlight(@PathVariable Long id,@ModelAttribute("flight") Flight_Details flight,Model model){
        //get flight from database by id
        Flight_Details existingFlight=flight_detailsService.getFlightById(id);
        existingFlight.setId();
        existingFlight.setName(flight.getName());
        existingFlight.setOrigin(flight.getOrigin());
        existingFlight.setDestination(flight.getDestination());
        existingFlight.setDuration(flight.getDuration());
        existingFlight.setFlightDate(flight.getFlightDate());
        existingFlight.setFlightTime(flight.getFlightTime());
        existingFlight.setFlightType(flight.getFlightType());
        existingFlight.setFlightNumber(flight.getFlightNumber());

        //save updated flight object
        flight_detailsService.updateFlight(existingFlight);
        return "redirect:/flights";

    }

    @GetMapping("/flights/{id}")
    public String deleteFlight(@PathVariable Long id){
        flight_detailsService.deleteFlightById(id);
        return "redirect:/flights";

    }

}
