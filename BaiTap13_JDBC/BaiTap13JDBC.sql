CREATE DATABASE employee_management;

USE employee_management;


CREATE TABLE employee (
    employee_id VARCHAR(30),
    fullName VARCHAR(30),
    birthDay DATE,
    phone VARCHAR(30),
    email VARCHAR(30),
    employee_type INT,
    
    PRIMARY KEY (employee_id)
);


CREATE TABLE certificates (
	certificate_id INT AUTO_INCREMENT,
    employee_id VARCHAR(30),
    
	certificatedID VARCHAR(30),
    certificateName VARCHAR(30),
    certificateRank VARCHAR(30),
    certificatedDate DATE,
    
    PRIMARY KEY(certificate_id),
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);



CREATE TABLE experience (
	employee_id VARCHAR(30),
    expInYear INT,
    proSkill VARCHAR(30),
    
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);


CREATE TABLE fresher (
	employee_id VARCHAR(30),
    graduation_date DATE,
    graduation_rank VARCHAR(30),
    education VARCHAR(30),

    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);


CREATE TABLE intern (
	employee_id VARCHAR(30),
    majors VARCHAR(30),
    semester INT,
    university_name VARCHAR(30),

    
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);
