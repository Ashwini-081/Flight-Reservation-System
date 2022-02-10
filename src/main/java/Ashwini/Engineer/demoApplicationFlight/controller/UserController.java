//package Ashwini.Engineer.demoApplicationFlight.controller;
//
//import Ashwini.Engineer.demoApplicationFlight.entity.AdminLogin;
//import Ashwini.Engineer.demoApplicationFlight.entity.Passenger;
//import Ashwini.Engineer.demoApplicationFlight.service.AdminLoginService;
//import Ashwini.Engineer.demoApplicationFlight.service.Flight_DetailsService;
//import Ashwini.Engineer.demoApplicationFlight.service.PassengerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Objects;
//
//@Controller
//public class UserController {
//    @Autowired
//    private Flight_DetailsService flight_detailsService;
//    @Autowired
//    private PassengerService passengerService;
//    @Autowired
//    private AdminLoginService userService;
//
//    //Home
//    @GetMapping("/")
//    public String home(){
//        return "home";
//    }
//
//    //Registration- after registering user will go to login page
//    @GetMapping("/register")
//    public String registrationForm() {
//        return "register";
//    }
//
//    @PostMapping("/login")
//    public String registration(HttpServletRequest request) {
//        String userName = request.getParameter("userName");
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String mobileNumber=request.getParameter("mobileNumber");
//        Passenger passenger= new Passenger(userName, name, email, password,mobileNumber);
//        passengerService.createCustomer(passenger);
//        return "login";
//    }
//
//    //Login - after login user will go to the list of Flight page
//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }
//
//    @GetMapping("/adminlogin")
//
//    public ModelAndView adminlogin() {
//        ModelAndView mav = new ModelAndView("adminlogin");
//        mav.addObject("admin", new AdminLogin());
//        return mav;
//    }
//
//    @PostMapping("/adminlogin")
//    public String adminlogin(@ModelAttribute("admin") AdminLogin user ) {
//
//        AdminLogin oauthUser = userService.login(user.getUsername(), user.getPassword());
//
//
//        System.out.print(oauthUser);
//        if (Objects.nonNull(oauthUser)) {
//
//            return "redirect:/flights";
//
//
//        } else {
//            return "redirect:/adminlogin";
//
//
//        }
//    }
//
//
//    @RequestMapping(value = {"/adminlogout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request, HttpServletResponse response)
//    {
//
//
//        return "redirect:/adminlogin";
//    }
//
//
//
//    @GetMapping("/userhomepage")
//    public String flights(Model model){
//        model.addAttribute("flights",flight_detailsService.getAllFlightDetails());
//        return "userhomepage";
//    }
//
//    @PostMapping("/userhomepage")
//    public String login(HttpServletRequest request, Model model) {
//        String userName = request.getParameter("userName");
//        String password = request.getParameter("password");
//        Passenger passenger;
//        if (passengerService.existsById(userName)) {
//            passenger = passengerService.findPassengerByUserName(userName);
//            if (password.equals(passenger.getPassword())) {
//                model.addAttribute("userName", userName);
////                model.addAttribute("flights", Flight_DetailsService.flightList());
//            } else {
//                model.addAttribute("message", "Wrong Password");
//                return "login";
//                //return "redirect:/login";
//            }
//        } else {
//            model.addAttribute("message", "Please enter valid User Name");
//            return "login";
//            //return "redirect:/login";
//        }
//        return "userhomepage";
//    }
//
//    @GetMapping("/booking")
//    public String booking(){
//        return "booking";
//    }
//
//}