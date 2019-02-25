package dao;

import com.mongodb.MongoClient;
import domain.Teacher;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class TeacherDAO extends BasicDAO<Teacher, Long> {
    public TeacherDAO(MongoClient mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
}
