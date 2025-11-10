package com.example.Blog_Management_System.service;

import com.example.Blog_Management_System.dto.request.RegisterRequest;

public interface AuthService {
    String login(String username, String password);

    // Hàm đăng ký
    void register(RegisterRequest registerRequest);
}
