package com.caps.in.Junittestdemo;

public class PersonValidator {
	public boolean validatePerson(Person person) {
        return validateName(person.getName()) && validateAge(person.getAge()) && validateEmail(person.getEmail());
    }

    private boolean validateName(String name) {
        return name != null && name.length() >= 3;
    }

    private boolean validateAge(int age) {
        return age >= 0;
    }

    private boolean validateEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$");
    }
}


