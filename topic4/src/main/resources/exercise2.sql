USE high_school;
-- Student values
INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Juan Ignacio","Cunha",34093820,"1988-10-11");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Jose Luis","Morales",10090807,"1990-04-09");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Cecilia","Veron",35987677,"1990-08-30");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Raul","Cunha",12345678,"1988-10-11");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Melisa","Morales",09876543,"1990-04-09");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Alberto","Veron",23456789,"1990-08-30");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Rosa","Cunha",10293847,"1988-10-11");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Mariana","Morales",31245786,"1990-04-09");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Antonia","Veron",67834567,"1990-08-30");

INSERT INTO student(firstName, lastName, registrationNumber, birthDate)
VALUES ("Florencia","Balberde",73738383,"1990-08-30");
-- Teacher values

INSERT INTO teacher(firstName,lastName,birthDate)
VALUES ("Carolina","Ramos","1982-10-24");

INSERT INTO teacher(firstName,lastName,birthDate)
VALUES ("Horacio","Echeverria","1969-01-19");

INSERT INTO teacher(firstName,lastName,birthDate)
VALUES ("Benito","Gonzales","1978-10-24");

-- Courses values

INSERT INTO course(name, teacherId, hourPerWeek)
VALUES ("Java basics",1,8);

INSERT INTO course(name, teacherId, hourPerWeek)
VALUES ("Java Spring",2,10);

INSERT INTO course(name, teacherId, hourPerWeek)
VALUES ("Java Spring security",3,6);


INSERT INTO course(name, teacherId, hourPerWeek)
VALUES ("Java Spring security advance",3,6);


-- Assist values
-- Assist course 1
-- 1
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(1,1,2019,10,9,8,9);
-- 2
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(2,1,2019,7,9,8,8);
-- 3
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(3,1,2019,4,9,8,6);
-- 4
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(4,1,2019,10,9,8,9);
-- 5
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(5,1,2019,7,9,4,6);
-- 6
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(6,1,2019,7,3,9,5);
-- 7
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(7,1,2019,10,9,10,9.66);
-- 8
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(8,1,2019,10,9,8,9);
-- 9
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(9,1,2019,10,9,8,9);
-- 10
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(10,1,2019,10,9,8,9);


-- Assist course 2
-- 1
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(1,2,2019,1,9,8,6);
-- 2
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(2,2,2019,7,9,8,8);
-- 3
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(3,2,2019,4,9,8,7);
-- 4
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(4,2,2019,10,9,8,8);
-- 5
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(5,2,2019,7,9,4,8);
-- 6
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(6,2,2019,7,3,9,6);
-- 7
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(7,2,2019,10,9,10,8);
-- 8
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(8,2,2019,10,9,8,8);
-- 9
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(9,2,2019,10,9,8,8);
-- 10
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(10,2,2019,10,9,8,8);


-- Assist course 3
-- 1
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(1,3,2019,10,9,8,8);
-- 2
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(2,3,2019,7,9,8,8);
-- 3
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(3,3,2019,4,9,8,8);
-- 4
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(4,3,2019,10,9,8,8);
-- 5
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(5,3,2019,7,9,4,8);
-- 6
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(6,3,2019,7,3,9,8);
-- 7
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(7,3,2019,10,9,10,8);
-- 8
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(8,3,2019,10,9,8,8);
-- 9
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(9,3,2019,10,9,8,8);
-- 10
INSERT INTO assist(id_student, id_course, year, firstTest, secondTest, thirdTest,finalScore)
VALUES(10,3,2019,10,9,8,8);



INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (1,1,2,"17:00","20:00");

INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (1,1,3,"17:00","20:00");

INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (1,1,6,"18:00","20:00");

INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (2,2,3,"10:00","20:00");

INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (3,3,5,"17:00","23:00");

INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (3,4,4,"10:00","13:00");

INSERT INTO courseschedule(id_teacher, id_course, day, start, finish)
VALUES (3,4,5,"10:00","13:00");

USE high_school; SELECT * FROM courseschedule WHERE id_teacher =3











