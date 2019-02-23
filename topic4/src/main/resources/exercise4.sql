DELIMITER $$
CREATE PROCEDURE percentageOfPassAndFails(IN idCourse INT, IN courseYear YEAR)

  BEGIN
    SELECT DISTINCT C.name AS "Course Name",
        (SELECT DISTINCT (SELECT DISTINCT (SELECT COUNT(A.finalScore) FROM assist A WHERE A.finalScore >= 7)*100
        /(SELECT COUNT(A.id_student) FROM assist A)))AS "Percentage of pass",
        (SELECT DISTINCT (SELECT COUNT(A.finalScore)FROM assist A WHERE A.finalScore < 7)*100
        /(SELECT COUNT(A.id_student) FROM assist A))AS "Percentage of fail"
    FROM course C join assist A ON C.id_course = A.id_course WHERE  A.id_course = idCourse AND A.year = courseYear;
  END

$$ DELIMITER ;

USE high_school;
CALL percentageOfPassAndFails(1,2019);

