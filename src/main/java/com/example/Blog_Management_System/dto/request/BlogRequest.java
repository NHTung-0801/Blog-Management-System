package com.example.Blog_Management_System.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BlogRequest {
    @NotBlank(message = "Tieu de khong duoc bo trong")
    @Size(max = 255, message = "Tieu de khong qua 255 ky tu")
    private String title;

    @NotBlank(message = "Noi dung khong duoc de trong")
    private String content;
}
