package Ashwini.Engineer.demoApplicationFlight.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @NotNull(message="username is compulsory")
    private String userName;
    private String name;
    @Column(unique = true)
    private String email;
//    @Length(min=8,message="password should be at least 8 characters" )
    @Column(name="password",nullable=false,length = 8)
    private String password;
    @Column(unique = true)
    private String mobileNumber;

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservation;


    public Customer() {
    }

    public Customer(String userName, String name, String email, String password,String mobileNumber) {
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobileNumber=mobileNumber;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return null;
    }



}