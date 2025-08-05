package org.example.vegnbiomsuser.dto;


import lombok.Data;

@Data
public class SignupResponse {
    private String username;
    private String email;
    private String password;
}
