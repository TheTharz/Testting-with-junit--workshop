import org.example.UserRegistrationForm;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationFormTests {
    UserRegistrationForm form = new UserRegistrationForm();

    @Test
    public void testCheckAgeValid() {
        assertTrue(form.checkAge(20));
    }

    @Test
    public void testCheckAgeInvalid() {
        assertFalse(form.checkAge(15));
    }

    @Test
    public void testCheckAgeBoundary() {
        assertTrue(form.checkAge(18));
    }

    @Test
    public void testStringInvalid(){
        assertFalse(form.checkAge(5));
    }
}
