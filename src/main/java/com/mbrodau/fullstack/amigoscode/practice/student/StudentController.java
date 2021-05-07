package com.mbrodau.fullstack.amigoscode.practice.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@AllArgsConstructor
@Path("/students")
public class StudentController {

    private final StudentService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> findAllStudent() {
        return service.findAllStudents();
    }
}
