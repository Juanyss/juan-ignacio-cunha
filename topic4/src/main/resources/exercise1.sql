CREATE DATABASE IF NOT EXISTS high_school;

USE high_school;

CREATE TABLE IF NOT EXISTS Student( id_student INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      firstName VARCHAR(50),
                      lastName VARCHAR(50) NOT NULL,
                      registrationNumber INTEGER(10) NOT NULL,
                      birthDate DATE NOT NULL,

                      PRIMARY KEY(id_student));

CREATE TABLE IF NOT EXISTS Teacher( id_teacher INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      firstName VARCHAR(50),
                      lastName VARCHAR(50) NOT NULL,
                      birthDate DATE NOT NULL,

                      PRIMARY KEY (id_teacher));

CREATE TABLE IF NOT EXISTS Course(id_course INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    name VARCHAR(50) NOT NULL,
                    teacherId INT UNSIGNED NOT NULL,
                    hourPerWeek INT,

                    PRIMARY KEY(id_course),
                    FOREIGN KEY (teacherId) REFERENCES Teacher(id_teacher));

CREATE TABLE IF NOT EXISTS Assist(id_student INT UNSIGNED NOT NULL,
                    id_course INT UNSIGNED NOT NULL,
                    year YEAR UNSIGNED NOT NULL,
                    firstTest DOUBLE UNSIGNED NOT NULL,
                    secondTest DOUBLE UNSIGNED NOT NULL,
                    thirdTest DOUBLE UNSIGNED NOT NULL,
                    finalScore DOUBLE UNSIGNED NOT NULL,


                    PRIMARY KEY(year,id_course,id_student),
                    FOREIGN KEY(id_course) REFERENCES Course(id_course),
                    FOREIGN KEY(id_student) REFERENCES Student(id_student));

CREATE TABLE IF NOT EXISTS courseSchedule(id_teacher INT UNSIGNED NOT NULL,
                      id_course INT UNSIGNED NOT NULL,
                      day INT UNSIGNED NOT NULL,
                      start TIME NOT NULL,
                      finish TIME NOT NULL,

                      PRIMARY KEY (id_teacher,id_course,day),
                      FOREIGN KEY(id_teacher) REFERENCES Teacher(id_teacher),
                      FOREIGN KEY(id_course) REFERENCES  Course(id_course))
