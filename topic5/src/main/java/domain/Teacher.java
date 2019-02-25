package domain;


import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Teacher extends BaseEntity {
    private String firstName;
    private String lastName;
    private Date birthDate;
    @Embedded
    private List<CourseName> inCharge;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, Date birthDate, List<CourseName> inCharge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.inCharge = inCharge;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<CourseName> getInCharge() {
        return inCharge;
    }

    public void setInCharge(List<CourseName> inCharge) {
        this.inCharge = inCharge;
    }
}
