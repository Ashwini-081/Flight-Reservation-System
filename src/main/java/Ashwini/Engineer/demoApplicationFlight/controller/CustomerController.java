package Ashwini.Engineer.demoApplicationFlight.controller;

import Ashwini.Engineer.demoApplicationFlight.entity.*;
import Ashwini.Engineer.demoApplicationFlight.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Objects;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AdminLoginService adminService;
    @Autowired
    private Flight_DetailsService flight_detailsService;
    @Autowired
    private PassangerService passangerService;


    //Home
    @GetMapping("/")
    public String home() {
        return "home";
    }

    //Registration- after registering user will go to login page
    @GetMapping("/register")
    public String registrationForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registration(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String mobileNumber = request.getParameter("mobileNumber");
        Customer customer = new Customer(userName, name, email, password, mobileNumber);
        customerService.createCustomer(customer);
        return "redirect:/login";
    }

    //Login - after login user will go to the list of movies page
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/adminlogin")

    public ModelAndView adminlogin() {
        ModelAndView mav = new ModelAndView("adminlogin");
        mav.addObject("admin", new AdminLogin());
        return mav;
    }

    @PostMapping("/adminlogin")
    public String adminlogin(@ModelAttribute("admin") AdminLogin user) {

        AdminLogin oauthUser = adminService.login(user.getUsername(), user.getPassword());


        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {

            return "redirect:/flights";


        } else {
            return "redirect:/adminlogin";


        }
    }


    @RequestMapping(value = {"/adminlogout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response) {


        return "redirect:/adminlogin";
    }


    @GetMapping("/userhomepage")
    public String flights(Model model) {
        model.addAttribute("flights", flight_detailsService.getAllFlightDetails());
        return "userhomepage";
    }

    @PostMapping("/userhomepage")
    public String login(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Customer customer;
        return "redirect:/userhomepage";
    }

//    @GetMapping("/payments")
//    public String payment(){
//        return "payment";
//    }

    @GetMapping("/success")
    public String success(){
        return "Success";
    }

    @GetMapping("/loginSuccess")
    public String loginsuccess(Principal principal){
        if(principal.getName().equals("Admin"))
            return "redirect:/flights";
        return "redirect:/userhomepage";
    }

    @GetMapping("/bookings")
    public String booking(Model model){
        //to hold form data
        Passanger passanger=new Passanger();
        model.addAttribute("passanger",passanger);
        return "booking";

    }

    @PostMapping("/bookings")
    public String saveFlight(HttpServletRequest request) {
        String name =request.getParameter("name");
        String email=request.getParameter("email");
        String pno=request.getParameter("pno");
        String age=request.getParameter("age");
        String male=request.getParameter("male");
        String gender=male==null?"female":"male";
        Passanger passanger=new Passanger(name,email,pno,age,gender);
        passangerService.savePassanger(passanger);
        return "redirect:/payments";
    }

    @GetMapping("/payments")
    public String payment(Model model){
//        //to hold form data
//        Payment payment=new Payment();
//        model.addAttribute("payment",payment);
        return "payment";

    }

    @PostMapping("/payments")
    public String savepayments(HttpServletRequest request) {
        String cardnumber =request.getParameter("cardnumber");
        String cardholder=request.getParameter("cardholder");
        String expirationmm=request.getParameter("expirationmm");
        String expirationyy=request.getParameter("expirationyy");
        String cvv=request.getParameter("cvv");

        Payment payment=new Payment(cardnumber,cardholder,expirationmm,expirationyy,cvv);
        PaymentService.save(payment);
        return "redirect:/success";
    }








//    @RequestMapping("/history")
//    public String history(Model model) {
//        User user = userService.getUserById(userId);
//        List<History> histories = historyService.getHistoryByUserName(user.getUserName());
//        model.addAttribute("histories", histories);
//        return "history";


//    @GetMapping("/viewReservations")
//    public String viewReservations(Model model){
//        Integer id=activeUser.getId();
//        Reservation reservation=reservationService.myReservationList(id);
//        model.addAttribute("reservations",reservationService.myReservationList(id));
//        return "viewReservations";
//    }
    }


