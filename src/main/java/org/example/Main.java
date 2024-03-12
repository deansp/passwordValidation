package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String password ="bhdgvfgfg3434";
        if(isPasswordValid(password)){
            System.out.println("alles gut");
        };
    }

    public static boolean isPasswordValid(String password){
         return isPasswordLengthValid(password) && containsDigits(password)
                && containsUppercaseAndLowercase(password) && isCommonPassword(password);
    }

    public static boolean isPasswordLengthValid(String password) {
        return password.length() >= 8;
    }

    public static boolean containsDigits(String password) {
    for(char character : password.toCharArray()){
            if (Character.isDigit(character)) return true;
        }
        return false;
    }

    public static boolean containsUppercaseAndLowercase(String password) {
        boolean containsLowerCase = false;
        boolean containsUpperCase = false;

        for (char character : password.toCharArray()) {
            if (Character.isLowerCase(character)) {
                containsLowerCase = true;
            } else if (Character.isUpperCase(character)) {
                containsUpperCase = true;
            }
            if (containsLowerCase && containsUpperCase) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password) {
        String[] commonPasswords = {"password1", "123456789A", "qwerty123", "lassmichrein1", "Geheim1", "admin123"};

        for (String commonPassword : commonPasswords) {
            if (password.equalsIgnoreCase(commonPassword)) {
                return false;
            }
        }
        return true;
    }
}




