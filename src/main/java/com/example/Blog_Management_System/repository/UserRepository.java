package com.example.Blog_Management_System.repository;

import com.example.Blog_Management_System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Tìm kiếm theo tên
    Optional<User> findByUsername(String username);

    // Kiểm tra xem username đã tồn tại chưa
    Boolean existsByUsername(String username);
}
