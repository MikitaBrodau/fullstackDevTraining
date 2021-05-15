package com.mbrodau.fullstack.amigoscode.practice.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("api/students")
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudents();
    }

    @GetMapping("{studentId}/courses")
    public List<StudentCourse> getAllCoursesForStudent(
            @PathVariable("studentId") UUID studentId) {
        return service.findAllCoursesForStudent(studentId);
    }

    @PostMapping
    public void addNewStudent(@RequestBody @Valid Student student) {
        service.addNewStudent(UUID.randomUUID(), student);
    }
}
