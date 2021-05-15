package com.mbrodau.fullstack.amigoscode.practice.student;

import com.mbrodau.fullstack.amigoscode.practice.EmailValidator;
import com.mbrodau.fullstack.amigoscode.practice.exception.ApiRequestException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentDataAccessService dataAccessService;
    private final EmailValidator emailValidator;

    List<Student> findAllStudents() {
        return dataAccessService.selectAllStudents();
    }

    void addNewStudent(UUID studentId, @Valid Student student) {
        UUID newStudentId = Optional.ofNullable(studentId)
                .orElse(UUID.randomUUID());
        //TODO: Verify that email not taken yet;
        //TODO: Validate that email;
        if (!emailValidator.test(student.getEmail())) {
            throw new ApiRequestException(student.getEmail() + " is not valid email");
        }
        if (dataAccessService.isEmailTaken(student.getEmail())) {
            throw new ApiRequestException(student.getEmail() + " is already taken");
        }
        dataAccessService.insertStudent(newStudentId, student);
    }

    public List<StudentCourse> findAllCoursesForStudent(UUID studentId) {
        return dataAccessService.findAllCoursesForStudent(studentId);
    }
}
