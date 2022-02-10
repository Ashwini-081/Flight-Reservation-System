package Ashwini.Engineer.demoApplicationFlight.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Flight_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String origin;
    private String destination;
    private String duration;
    private String flightDate;
    private String flightTime;
    private String flightType;
    @Column(unique = true)
    private String flightNumber;
    private Long amount;

    public Flight_Details(){}

    public Flight_Details(long id, String name, String origin, String destination, String duration, String flightDate, String flightTime, String flightType, String flightNumber,Long amount) {
        super();
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.flightType = flightType;
        this.flightNumber = flightNumber;
        this.amount=amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setId() {

    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
