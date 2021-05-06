package com.mbrodau.fullstack.amigoscode.practice.student;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Student {

    private final UUID studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    enum Gender{
        MALE,FEMALE
    }
}
