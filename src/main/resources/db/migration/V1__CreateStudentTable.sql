CREATE TABLE IF NOT EXISTS Student (
    student_id UUID PRIMARY KEY NOT NULL,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    gender VARCHAR(6) NOT NULL
        CHECK (
        gender = 'MALE' OR
        gender = 'FEMALE' OR
        gender = 'male' OR
         gender = 'female')
);