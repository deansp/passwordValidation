package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void returnFalse_whenPasswordLenght7Characters(){
        //GIVEN
        String Password = "1234567";
        //WHEN
        boolean actual = Main.isPasswordLengthValid(Password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void returnTrue_whenPasswordLenght8Characters(){
        //GIVEN
        String Password = "12345678";
        //WHEN
        boolean actual = Main.isPasswordLengthValid(Password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void returnTrue_whenPassword_ABCDEFG1(){
        //GIVEN
        String Password = "ABCDEFG1";
        //WHEN
        boolean actual = Main.containsDigits(Password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalse_whenPassword_ABCDEFGH(){
        //GIVEN
        String Password = "ABCDEFGH";
        //WHEN
        boolean actual = Main.containsDigits(Password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void returnTrue_whenPassword_AbCDEFG(){
        //GIVEN
        String Password = "AbCDEFGH";
        //WHEN
        boolean actual = Main.containsUppercaseAndLowercase(Password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalse_whenPassword_ABCDEFG(){
        //GIVEN
        String Password = "ABCDEFGH";
        //WHEN
        boolean actual = Main.containsUppercaseAndLowercase(Password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void returnTrue_whenPassword_AbCDEFG1(){
        //GIVEN
        String[] commonPasswords = {"password1", "123456", "qwerty", "lassmichrein", "Geheim1", "admin"};
        String Password = "AbCDEFGH1";
        //WHEN
        boolean actual = Main.isCommonPassword(Password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalse_whenPassword_Geheim1(){
        //GIVEN
        String Password = "Geheim1";
        //WHEN
        boolean actual = Main.isCommonPassword(Password);
        //THEN
        Assertions.assertFalse(actual);
    }
}