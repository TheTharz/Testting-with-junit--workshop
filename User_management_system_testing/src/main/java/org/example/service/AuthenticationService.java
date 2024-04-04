package org.example.service;

public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        return !username.isEmpty() && !password.isEmpty();
    }
}
