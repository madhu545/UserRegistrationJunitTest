import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationLambda {
    boolean matches(String pattern,String input);
}

public class UserRegistration {
    UserRegistrationLambda matchInput = ((pattern, input) -> Pattern.compile(pattern).matcher(input).matches());
    private static final String namePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%*]{1})(?=.*[a-z]){8,}.*";
    private static final String emailPattern = "(^[A-Za-z0-9]{1,}[-+_.]{0,1})[A-Za-z0-9]{0,}[@]{1}[A-Za-z0-9]{1,}[.]{1}[A-Za-z]{2,3}[.]{0,1}[A-Za-z]{0,3}";
    private static final String phoneNoPattern = "^[0-9]{2}\\s{1}[0-9]{10}$";

    public boolean firstNameValidation(String firstname) throws UserRegistrationException {
        boolean result = matchInput.matches(namePattern,firstname);
        if(result) {
            System.out.println("name is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("name is not valid");
        }
    }

    public boolean lastNameValidation(String lastname) throws UserRegistrationException {
        boolean result = matchInput.matches(namePattern,lastname);
        if(result) {
            System.out.println("Last name is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("lastname is not valid");
        }
    }

    public boolean emailValidation(String email) throws UserRegistrationException {
        boolean result = matchInput.matches(emailPattern,email);
        if(result) {
            System.out.println("email is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("email is not valid");
        }
    }

    public boolean phoneNoValidation(String phonenumber) throws UserRegistrationException {
        boolean result = matchInput.matches(phoneNoPattern,phonenumber);
        if(result) {
            System.out.println("phone number is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("phone no is not valid");
        }
    }

    public boolean passwordValidation(String password) throws UserRegistrationException {
        boolean result = matchInput.matches(passwordPattern,password);
        if(result) {
            System.out.println("password is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("password is not valid");
        }
    }
}
