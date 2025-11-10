package com.example.Blog_Management_System.repository;

import com.example.Blog_Management_System.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    // Tìm kiếm bài viết theo tiêu đề
    Page<Blog> findByTitleContaining(String title, Pageable pageable);

    // Tìm tất cả bài viết của một tác giả
    Page<Blog> findByAuthorId(Long userId, Pageable pageable);
}
