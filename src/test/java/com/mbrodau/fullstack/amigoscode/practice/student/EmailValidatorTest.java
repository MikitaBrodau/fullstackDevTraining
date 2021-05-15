package com.mbrodau.fullstack.amigoscode.practice.student;

import com.mbrodau.fullstack.amigoscode.practice.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    private final EmailValidator underTest = new EmailValidator();

    @Test
    void isShouldValidateCorrectEmail() {
        assertThat(underTest.test("Hello@Gmail.com")).isTrue();
    }

    @Test
    void isShouldValidateIncorrectCorrectEmail() {
        assertThat(underTest.test("Hello@com")).isFalse();
        assertThat(underTest.test("Hello.com")).isFalse();
    }

    @Test
    void isShouldValidateIncorrectCorrectEmailWithDotAtTheEnd() {
        assertThat(underTest.test("Hello@gmail")).isFalse();
    }
}