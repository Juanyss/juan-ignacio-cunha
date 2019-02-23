
DELIMITER $$
CREATE PROCEDURE studentListAndTeacherFromOneCourse(IN idCourse INT, IN courseYear YEAR)

BEGIN
    SELECT C.name AS "Course Name",CONCAT(T.lastName,", ",T.firstName) AS Teacher ,
           CONCAT(S.lastName,", ",S.firstName) AS "Student"
           FROM teacher T JOIN course C ON T.id_teacher = C.teacherId
                          JOIN assist A ON C.id_course = A.id_course
                          JOIN student S ON A.id_student = s.id_student
    WHERE A.id_course = idCourse AND A.year = courseYear ORDER BY S.lastName;
END

$$ DELIMITER ;

USE high_school;
CALL studentListAndTeacherFromOneCourse(1,2019);


