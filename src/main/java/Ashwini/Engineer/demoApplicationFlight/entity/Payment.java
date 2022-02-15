package Ashwini.Engineer.demoApplicationFlight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 10)
    private static Long cardnumber;
    private static String cardholder;
    private static String expirationmm;
    private static String expirationyy;
    @Column(length =4 )
    private static String cvv;

    public Payment(){}

    public Payment(Long cardnumber, String cardholder, String expirationmm, String expirationyy, String cvv) {
        this.cardnumber = cardnumber;
        this.cardholder = cardholder;
        this.expirationmm = expirationmm;
        this.expirationyy = expirationyy;
        this.cvv = cvv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(Long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getExpirationmm() {
        return expirationmm;
    }

    public void setExpirationmm(String expirationmm) {
        this.expirationmm = expirationmm;
    }

    public String getExpirationyy() {
        return expirationyy;
    }

    public void setExpirationyy(String expirationyy) {
        this.expirationyy = expirationyy;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
