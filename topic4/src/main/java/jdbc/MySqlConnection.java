package jdbc;

import java.sql.*;

public class MySqlConnection {
    public static void  teacherSchedule(Integer teacherId){

        String url = "jdbc:mysql://localhost:3306/high_school?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password ="440036cU";

        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

            /**
             / Bring from high_school db Teacher's Last name and First Name
             @Param teacherId
             */
            String teacher = String.format("SELECT CONCAT(T.lastName,\", \",T.firstName) AS Teacher\n" +
                    "FROM teacher T WHERE T.id_teacher = %d",teacherId);

            ResultSet teacherResult = statement.executeQuery(teacher);

            /**
             / Bring teacher's schedule(Day, Time from - to and course name) from high_school db
             @Param teacherId
             */
            String schedule = String.format("SELECT CONCAT (CASE\n" +
                    "                   WHEN CS.day = 0 THEN \"Sunday:\"\n" +
                    "                   WHEN CS.day = 1 THEN \"Monday:\"\n" +
                    "                   WHEN CS.day = 2 THEN \"Tuesday:\"\n" +
                    "                   WHEN CS.day = 3 THEN \"Wednesday:\"\n" +
                    "                   WHEN CS.day = 4 THEN \"Thursday:\"\n" +
                    "                   WHEN CS.day = 5 THEN \"Friday:\"\n" +
                    "                   WHEN CS.day = 6 THEN \"Saturday:\"\n" +
                    "                   ELSE \"Error - Wrong Day\"\n" +
                    "                  END,\" \", CS.start, \" - \", CS.finish, \": \", C.name) AS \"Schedule\"\n" +
                    " FROM courseSchedule CS JOIN course C ON CS.id_course = C.id_course \n"  +
                    "JOIN teacher T ON CS.id_teacher = T.id_teacher \n" +
                    " WHERE CS.id_teacher = %d ORDER BY CS.day",teacherId);

            statement = connection.createStatement();
            ResultSet resultSchedule = statement.executeQuery(schedule);

            /**
            / Print Teacher's Last name and First Name
             @Param teacherId
            */
            System.out.println("Teacher:");
            while (teacherResult.next()) {
                System.out.println(teacherResult.getString("teacher"));
            }


            /**
             / Print teacher's schedule(Day, Time from - to and course name)
             @Param teacherId
             */
            System.out.println("Schedule:");
            while (resultSchedule.next()) {
                System.out.println(resultSchedule.getString("schedule"));
            }
        }

        catch (SQLException error) {
            error.printStackTrace();
        }

    }
}
