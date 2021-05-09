import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
        private static final String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
        private static final String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
        private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])((?=.*[@#$%*()_]){1})(?=.*[a-z]){8,}.*";
        private static final String emailPattern = "^[0-9a-zA-z]+([._+-][0-9a-zA-z]*)*"+
                                            "@([a-zA-z0-9][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        private static final String numberPattern = "[0-9]{2}\\s[0-9]{10}";


            public boolean firstNameValidation(String firstname) throws UserRegistrationException {
                boolean result = Pattern.compile(firstNamePattern).matcher(firstname).matches();
                if (result) {
                    System.out.println("firstname is valid");
                    return true;
                } else {
                    throw new UserRegistrationException("firstname is not valid");
                }
            }

              public boolean lastNameValidation(String lastname) throws UserRegistrationException {
                    boolean result = Pattern.compile(lastNamePattern).matcher(lastname).matches();
                    if (result) {
                        System.out.println("lastname is valid");
                        return true;
                    } else {
                        throw new UserRegistrationException("lastname is not valid");
                    }
                }

                    public boolean passwordValidation(String password) throws UserRegistrationException {
                        boolean result = Pattern.compile(passwordPattern).matcher(password).matches();
                        if (result) {
                            System.out.println("password is valid");
                            return true;
                        } else {
                            throw new UserRegistrationException("password is not valid");
                        }
        }

                        public boolean emailValidation (String email) throws UserRegistrationException {
                            boolean result = Pattern.compile(emailPattern).matcher(email).matches();


                            if (result) {
                                System.out.println("email is valid");
                                return true;
                            } else {
                                throw new UserRegistrationException("email is not valid");
                            }
                        }


                            public boolean numberValidation (String number) throws UserRegistrationException {
                                boolean result = Pattern.compile(numberPattern).matcher(number).matches();
                                if (result) {
                                    System.out.println("number is valid");
                                    return true;
                                } else {
                                    throw new UserRegistrationException("number is not valid");
                                }
                            }
       }

