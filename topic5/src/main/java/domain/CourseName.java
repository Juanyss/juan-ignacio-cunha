package domain;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class CourseName {
    private String courseName;

    public CourseName() {
    }

    public CourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
