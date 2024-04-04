package test;

import static org.junit.Assert.*;

import org.example.service.AuthenticationService;
import org.junit.Test;

public class AuthenticationServiceTest {

    @Test
    public void testLoginWithValidCredentials() {
        assertTrue(AuthenticationService.login("user1", "Password@123"));
    }

    @Test
    public void testLoginWithInvalidUsername() {
        assertFalse(AuthenticationService.login("invalidUser", "Password@123"));
    }

    @Test
    public void testLoginWithInvalidPassword() {
        assertFalse(AuthenticationService.login("user1", "weakpassword")); // missing special character
        assertFalse(AuthenticationService.login("user1", "12345678")); // missing capital letter and special character
        assertFalse(AuthenticationService.login("user1", "Password123")); // missing special character
        assertFalse(AuthenticationService.login("user1", "Password@")); // missing number
    }

    @Test
    public void testLoginWithNullUsername() {
        assertFalse(AuthenticationService.login(null, "Password@123"));
    }

    @Test
    public void testLoginWithNullPassword() {
        assertFalse(AuthenticationService.login("user1", null));
    }
}
