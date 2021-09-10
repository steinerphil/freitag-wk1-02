package com.company;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class Password {

    //Fields
    private final String password;
    private final char[] passwordCharArray;

    //Constructor
    public Password(String password) {
        this.password = password;

        char[] charsOfPassword = new char[password.length()];
        for (int i = 0; i < charsOfPassword.length; i++) {
            charsOfPassword[i] = password.charAt(i);
        }
        this.passwordCharArray = charsOfPassword;
    }

    //Getter
    public String getPassword() {
        return password;
    }


    // Password Methods
    // Single Password Validator
    public boolean validatePassword() {
        boolean passwordValid = false;
        if (checkLowerAndUpperCase() && checkPasswordLength() && checkContainsDigit()) {
            System.out.println("Password is valid");
            passwordValid = true;
        }
        return passwordValid;
    }


    private boolean checkPasswordLength() {
        int passwordMinLength = 8;
        boolean lengthIsOk = true;
        if (password.length() < passwordMinLength) {
            System.out.println("Password is too short.");
            lengthIsOk = false;
        }
        return lengthIsOk;
    }


    private boolean checkContainsDigit() {
        boolean containsDigit = false;

        for (char value : passwordCharArray) {
            containsDigit = isDigit(value);
            if (containsDigit) break;
        }
        if (!containsDigit) {
            System.out.println("Your password must contain digits.");
        }
        return containsDigit;
    }


    private boolean checkLowerAndUpperCase() {
        boolean containsUpperCase = false;
        for (char value : passwordCharArray) {
            containsUpperCase = isUpperCase(value);
            if (containsUpperCase) break;
        }
        if (!containsUpperCase) {
            System.out.println("Your password must contain upper case characters.");
        }
        return containsUpperCase;
    }

}
