package domain;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class CourseSchedule {
    private String day;
    private String start;
    private String finish;

    public CourseSchedule() {
    }

    public CourseSchedule(String day, String start, String finish) {
        this.day = day;
        this.start = start;
        this.finish = finish;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }
}
