package Ashwini.Engineer.demoApplicationFlight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passanger {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private long pno;
    private int age;
    private String gender;

    public Passanger(long id, String name, String email, long pno, int age, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pno = pno;
        this.age = age;
        this.gender = gender;
    }

    public Passanger(){}

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

    public long getPno() {
        return pno;
    }

    public void setPno(long pno) {
        this.pno = pno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
