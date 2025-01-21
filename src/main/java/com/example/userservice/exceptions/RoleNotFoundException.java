package com.example.userservice.exceptions;

public class RoleNotFoundException extends RuntimeException {
    public RoleNotFoundException() {
        super("Role is not found");
    }
}
