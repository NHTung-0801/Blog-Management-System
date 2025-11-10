package com.example.Blog_Management_System.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Password khong duoc de trong")
    @Size(min = 3, max = 20, message = "Username phai tu 3 den 20 ky tu")
    private String username;

    @NotBlank(message = "Password khong duoc de trong")
    @Size(min = 8, max = 16, message = "Password phai tu 8 den 16 ky tu")
    private String password;
}
