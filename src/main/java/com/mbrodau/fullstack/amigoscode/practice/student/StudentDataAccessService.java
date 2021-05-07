package com.mbrodau.fullstack.amigoscode.practice.student;

import com.mbrodau.fullstack.amigoscode.practice.student.Student.Gender;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Component
public class StudentDataAccessService {

    private final JdbcTemplate jdbcTemplate;

    public List<Student> selectAllStudents() {
        String sql =
                "SELECT student_id,"
                        + " first_name,"
                        + " last_name,"
                        + " email,"
                        + " gender "
                        + "FROM student";
        return jdbcTemplate.query(
                sql,
                mapStudentFromDb());
    }

    private RowMapper<Student> mapStudentFromDb() {
        return (resultSet, i) -> {
            UUID studentId = UUID.fromString(resultSet.getString("student_id"));
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            Gender gender = Gender.valueOf(resultSet.getString("gender"));

            return new Student(
                    studentId,
                    firstName,
                    lastName,
                    email,
                    gender);
        };
    }
}
