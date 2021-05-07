import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
        private static final String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
        private static final String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
        private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])((?=.*[@#$%*()_]){1})(?=.*[a-z]){8,}.*";
        private static final String emailPattern = "^[0-9a-zA-z]+([._+-][0-9a-zA-z]*)*"+
                                            "@([a-zA-z0-9][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        private static final String numberPattern = "[0-9]{2}\\s[0-9]{10}";

        public boolean firstNameValidation(String firstname) {
            Pattern pattern = Pattern.compile(firstNamePattern);
            return pattern.matcher(firstname).matches();
        }


        public boolean lastNameValidation(String lastname) {
        Pattern pattern = Pattern.compile(lastNamePattern);
        return pattern.matcher(lastname).matches();
       }

        public boolean passwordValidation(String password) {
            Pattern pattern = Pattern.compile(passwordPattern);
            return pattern.matcher(password).matches();
        }

        public boolean emailValidation(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(email).matches();
    }

        public boolean numberValidation(String number) {
        Pattern pattern = Pattern.compile(numberPattern);
        return pattern.matcher(number).matches();
    }


    }

