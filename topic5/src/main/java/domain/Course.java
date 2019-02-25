package domain;


import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

import java.util.List;

@Entity
public class Course extends BaseEntity {
    private String name;
    @Embedded
    private List<CourseSchedule> courseSchedule;
    private Integer hourPerWeek;

    public Course() {
    }

    public Course(String name, List<CourseSchedule> courseSchedule, Integer hourPerWeek) {
        this.name = name;
        this.courseSchedule = courseSchedule;
        this.hourPerWeek = hourPerWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseSchedule> getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(List<CourseSchedule> courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public Integer getHourPerWeek() {
        return hourPerWeek;
    }

    public void setHourPerWeek(Integer hourPerWeek) {
        this.hourPerWeek = hourPerWeek;
    }
}



