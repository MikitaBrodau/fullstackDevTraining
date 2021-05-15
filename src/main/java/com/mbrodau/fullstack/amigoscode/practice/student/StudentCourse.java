package com.mbrodau.fullstack.amigoscode.practice.student;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class StudentCourse {

    private final UUID studentId;
    private final UUID courseId;
    private final String name;
    private final String description;
    private final String department;
    private final String teacherName;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Integer grade;

//    public StudentCourse(UUID studentId,
//                         UUID courseId,
//                         String name,
//                         String description,
//                         String department,
//                         LocalDate startDate,
//                         LocalDate endDate) {
//        this.studentId = studentId;
//        this.courseId = courseId;
//        this.name = name;
//        this.description = description;
//        this.department = department;
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }
}
