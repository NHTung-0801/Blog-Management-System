package com.example.Blog_Management_System.service;

import com.example.Blog_Management_System.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BlogService {

    Blog createBlog(Blog blog, Long userId);

    Optional<Blog> getBlogById(Long blogId);

    Page<Blog> getAllBlog(String searchTerm, Pageable paeable);

    Blog udateBlog(Blog blog, Long userId);

    void deleteBlog(Blog blog, Long userId);
}
