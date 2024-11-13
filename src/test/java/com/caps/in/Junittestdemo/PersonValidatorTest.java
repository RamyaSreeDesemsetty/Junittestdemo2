package com.caps.in.Junittestdemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonValidatorTest {
	@Test
    void validPerson() {
        // Arrange
        PersonValidator validator = new PersonValidator();
        Person person = new Person("John Doe", 25, "john.doe@example.com");

        // Act and Assert
        assertTrue(validator.validatePerson(person));
    }

    @Test
    void invalidName_TooShort() {
        // Arrange
        PersonValidator validator = new PersonValidator();
        Person person = new Person("A", 30, "short.name@example.com");

        // Act and Assert
        assertFalse(validator.validatePerson(person));
    }

    @Test
    void invalidName_Null() {
        // Arrange
        PersonValidator validator = new PersonValidator();
        Person person = new Person(null, 30, "null.name@example.com");

        // Act and Assert
        assertFalse(validator.validatePerson(person));
    }

    @Test
    void invalidAge_Negative() {
        // Arrange
        PersonValidator validator = new PersonValidator();
        Person person = new Person("Alice", -5, "alice@example.com");

        // Act and Assert
        assertFalse(validator.validatePerson(person));
    }

    @Test
    void invalidEmail_InvalidFormat() {
        // Arrange
        PersonValidator validator = new PersonValidator();
        Person person = new Person("Bob", 40, "invalid.email");

        // Act and Assert
        assertFalse(validator.validatePerson(person));
    }

    @Test
    void invalidEmail_Null() {
        // Arrange
        PersonValidator validator = new PersonValidator();
        Person person = new Person("Charlie", 22, null);

        // Act and Assert
        assertFalse(validator.validatePerson(person));
    }
}


