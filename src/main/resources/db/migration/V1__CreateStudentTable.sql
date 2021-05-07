CREATE TABLE IF NOT EXISTS student (
    student_id UUID PRIMARY KEY NOT NULL,
    first_Name VARCHAR(100) NOT NULL,
    last_Name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    gender VARCHAR(6) NOT NULL
        CHECK (
         gender = 'MALE'    OR
         gender = 'FEMALE'  OR
         gender = 'male'    OR
         gender = 'female'
         )
);