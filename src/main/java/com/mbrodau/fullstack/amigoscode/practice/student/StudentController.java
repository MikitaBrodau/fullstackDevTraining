package com.mbrodau.fullstack.amigoscode.practice.student;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

import static com.mbrodau.fullstack.amigoscode.practice.student.Student.Gender.FEMALE;
import static com.mbrodau.fullstack.amigoscode.practice.student.Student.Gender.MALE;

@Controller
@Path("student")
public class StudentController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> findAllStudent() {
        return List.of(
                new Student(
                        UUID.randomUUID(),
                        "James",
                        "Bond",
                        "jamesbond@gmail.com",
                        MALE),
                new Student(
                        UUID.randomUUID(),
                        "Elisa",
                        "Tamara",
                        "elisTam@gmail.com",
                        FEMALE
                ));
    }
}
