import com.mongodb.MongoClient;
import dao.CourseDAO;
import dao.StudentDAO;
import domain.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;

import java.util.*;

public class Topic5Demo {
    private static final MongoClient mongo = new MongoClient();
    private static final Morphia morphia = new Morphia();
    private static final String dbName = "high_school";

    private static final StudentDAO studentDAO = new StudentDAO(mongo,morphia,dbName);
    private static final CourseDAO courseDAO = new CourseDAO(mongo,morphia,dbName);


    public static void main(String[] args){
        studentsGreaterThanFour();
    }

    /**
     * Data Injection through DAO classes
     */
    private static ObjectId dataInjection(){
        Course course = new Course("Java Basics",
                Arrays.asList( new CourseSchedule("Monday","10:00","13:00"),
                               new CourseSchedule("Wednesday","10:00","13:00"),
                               new CourseSchedule("Friday","10:00","12:00")),8);


        courseDAO.save(course);

        Student student1 = new Student("Juan","Cunha",1,new Date(1988-10-11),
                Collections.singletonList(new Assist(course.getId(),2019,10.,9.,
                        8.,9.)));

        Student student2 = new Student("Cecilia","Veron",2,new Date(1990-8-30),
                Collections.singletonList(new Assist(course.getId(),2019,10.,10.,
                        8.,9.33)));

        Student student3 = new Student("Jose","Cunha",3,new Date(1990-4-9),
                Collections.singletonList(new Assist(course.getId(),2019,1.,1.,
                        1.,1.)));

        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);


        return course.getId();

    }

    private static void studentsGreaterThanFour() {
        ObjectId courseId = dataInjection();
        Datastore datastore = morphia.createDatastore(mongo, dbName);
        Query<Student> query = datastore.createQuery(Student.class);
        Query<Assist> criteria = datastore.createQuery(Assist.class)
                .field("id_course").equal(courseId).field("finalScore").greaterThan(4.);

        query.field("assist").elemMatch(criteria);

        QueryResults<Student> queryResults = studentDAO.find(query);

        for (Student student : queryResults) {
            System.out.format("%s, %s - %.2f\n", student.getLastName(), student.getFirstName(),
                    student.getAssist().get(0).getFinalScore().doubleValue());
        }
    }
}

