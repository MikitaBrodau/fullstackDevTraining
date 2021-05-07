package com.mbrodau.fullstack.amigoscode.practice.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentDataAccessService dataAccessService;

    public List<Student> findAllStudents() {
        return dataAccessService.selectAllStudents();
    }
}
