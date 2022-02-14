package Ashwini.Engineer.demoApplicationFlight.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passanger {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String pno;
    private String age;
    private String gender;

//    @JsonIgnore
//    @ManyToOne
//    private Flight_Details flight_details;
//    @ManyToOne
//    private Customer customer;
//


    public Passanger( String name, String email, String pno, String age, String gender) {

        this.name = name;
        this.email = email;
        this.pno = pno;
        this.age = age;
        this.gender = gender;
    }
    public Passanger(){}

    public Passanger(String name, String email, String pno, String gender) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
