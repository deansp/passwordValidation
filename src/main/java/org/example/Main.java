package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String password ="bhdffgf54";
        if(isPasswordValid(password)){
            System.out.println("alles gut");
        };
    }

    public static boolean isPasswordValid(String password){
        if(!isPasswordLengthValid(password))System.out.println("zu kurz");
        if(!containsDigits(password))System.out.println("Zahl fehlt");
        if(!containsUppercaseAndLowercase(password))System.out.println("groß und klein-Buchstaben verwenden");
        if(!isCommonPassword(password))System.out.println("komm, sei kreativ");

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
                return false;
            }
        }
        return true;
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




