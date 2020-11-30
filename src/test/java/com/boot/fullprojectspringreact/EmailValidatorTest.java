package com.boot.fullprojectspringreact;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    private final EmailValidator underTest = new EmailValidator();

    @Test
    void itShouldValidateCorrectEmail() {
        assertThat(underTest.test("hello@gmail.com")).isTrue();
    }

    @Test
    void itShouldValidateAnIncorrectEmail() {
        assertThat(underTest.test("hellogmail.com")).isFalse();
    }

    @Test
    void itShouldValidateAnIncorrectEmailWithoutDotAtEnd() {
        assertThat(underTest.test("hello@gmailcom")).isFalse();
    }
}