
DELIMITER $$
CREATE PROCEDURE teacherSchedule(IN idTeacher INT)

BEGIN
   SELECT CONCAT("Teacher: ",T.lastName,", ", T.firstName )AS Teacher,
          CONCAT(CASE
                   WHEN CS.day = 0 THEN "Sunday"
                   WHEN CS.day = 1 THEN "Monday"
                   WHEN CS.day = 2 THEN "Tuesday"
                   WHEN CS.day = 3 THEN "Wednesday"
                   WHEN CS.day = 4 THEN "Thursday"
                   WHEN CS.day = 5 THEN "Friday"
                   WHEN CS.day = 6 THEN "Saturday"
                   ELSE "Error - Wrong Day"
                  END," ", CS.start, " - ", CS.finish, ": ", C.name) AS "Schedule"
   FROM teacher T JOIN courseschedule CS ON T.id_teacher = CS.id_teacher
                  JOIN course C on CS.id_course = c.id_course
   WHERE CS.id_teacher = idTeacher ORDER BY CS.day;
END

$$ DELIMITER ;

USE high_school;
CALL teacherSchedule(3)





