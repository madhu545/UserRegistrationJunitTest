import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
        @Test
        public void checkFirstName() {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.firstNameValidation("Jeff");
            Assert.assertEquals(true, result);
        }

    @Test
    public void checkLastName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastNameValidation("Bezos");
        Assert.assertEquals(true, result);
    }
    @Test
    public void checkPassword() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.passwordValidation("Madhu@123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void checkEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailValidation("abc.xyz@bl.com.in");
        Assert.assertEquals(true, result);
    }
    @Test
    public void checkNumber() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.numberValidation("91 8247473242");
        Assert.assertEquals(true, result);
    }

    }


