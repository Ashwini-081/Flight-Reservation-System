package Ashwini.Engineer.demoApplicationFlight.entity;

import javax.persistence.*;

@Entity
public class Reservation{
    @Id
    @GeneratedValue
    private Integer id;


    @OneToOne
    private Flight_Details flight;
    @ManyToOne
    @JoinColumn
    private Customer customer;
    @ManyToOne
    @JoinColumn
    private Passanger passanger;
    public Reservation() {
    }
    public Reservation(Flight_Details flight, Customer customer) {
        this.flight = flight;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Flight_Details getFlight_details() {
        return flight;
    }

    public void setFlight_details(Flight_Details flight) {
        this.flight = flight;
    }
}