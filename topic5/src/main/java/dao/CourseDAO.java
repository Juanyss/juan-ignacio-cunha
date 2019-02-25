package dao;

import com.mongodb.MongoClient;
import domain.Course;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class CourseDAO extends BasicDAO<Course, Long> {
    public CourseDAO(MongoClient mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
}
