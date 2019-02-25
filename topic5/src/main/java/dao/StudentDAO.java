package dao;

import com.mongodb.MongoClient;
import domain.Student;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class StudentDAO extends BasicDAO<Student, Long> {
    public StudentDAO(MongoClient mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
}
