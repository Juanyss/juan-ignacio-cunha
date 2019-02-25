package domain;


import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

import java.util.Date;
import java.util.List;


@Entity
public class Student extends BaseEntity {
    private String firstName;
    private String lastName;
    private Integer registrationNumber;
    private Date birthDate;
    @Embedded
    private List<Assist> assist;

    public Student() {
    }

    public Student(String firstName, String lastName, Integer registrationNumber, Date birthDate, List<Assist> assist) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
        this.birthDate = birthDate;
        this.assist = assist;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Assist> getAssist() {
        return assist;
    }

    public void setAssist(List<Assist> assist) {
        this.assist = assist;
    }
}
