package domain;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Assist {
    private ObjectId id_course;
    private Integer year;
    private Double firstTest;
    private Double secondTest;
    private Double thirdTest;
    private Double finalScore;

    public Assist() {
    }

    public ObjectId getId_course() {
        return id_course;
    }

    public void setId_course(ObjectId id_course) {
        this.id_course = id_course;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(Double firstTest) {
        this.firstTest = firstTest;
    }

    public Double getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(Double secondTest) {
        this.secondTest = secondTest;
    }

    public Double getThirdTest() {
        return thirdTest;
    }

    public void setThirdTest(Double thirdTest) {
        this.thirdTest = thirdTest;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public Assist(ObjectId id_course, Integer year, Double firstTest, Double secondTest, Double thirdTest, Double finalScore) {
        this.id_course = id_course;
        this.year = year;
        this.firstTest = firstTest;
        this.secondTest = secondTest;
        this.thirdTest = thirdTest;
        this.finalScore = finalScore;


    }
}
