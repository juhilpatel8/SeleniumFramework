package main.java.com.cardus.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Juhil on 7/28/2017.
 */

@Entity
@Table(name="PERSONS")
public class Persons {

    @Id
    private String id;

    @Column(name="LASTNAME")
    private String lastName;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="EMAILID")
    private String emaild;

    @Column(name="CITY")
    private String city;

    @Column(name="ADDRESS1")
    private String address1;

    @Column(name="ADDRESS2")
    private String address2;

    @Column(name="PHONENUMBER")
    private String phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmaild() {
        return emaild;
    }

    public void setEmaild(String emaild) {
        this.emaild = emaild;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
