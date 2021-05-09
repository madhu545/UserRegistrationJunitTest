import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
        @Test
        public void givenFirstName_WhennotValid_ShouldThrowException() throws UserRegistrationException {
            try {
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.firstNameValidation("Jeff");
                Assert.assertEquals(true, result);
            } catch (UserRegistrationException e) {
                e.printStackTrace();
            }
        }
    @Test
    public void givenLaststName_WhennotValid_ShouldThrowException() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.lastNameValidation("Bezos");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void  givenPassword_WhennotValid_ShouldThrowException() throws UserRegistrationException {
        try {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.passwordValidation("Madhu@123");
        Assert.assertEquals(true, result);
    }  catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhennotValid_ShouldThrowException() throws UserRegistrationException {
        try {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailValidation("abc.xyz@bl.com.in");
        Assert.assertEquals(true, result);
    } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNumber_WhennotValid_ShouldThrowException() throws UserRegistrationException {
        try {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.numberValidation("91 8247473242");
        Assert.assertEquals(true, result);
    }  catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    }


