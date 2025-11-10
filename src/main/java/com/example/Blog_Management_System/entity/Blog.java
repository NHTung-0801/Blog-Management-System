package com.example.Blog_Management_System.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "blogs")
@Data
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob // Dùng cho các trường văn bản dài
    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @CreationTimestamp // Tự động gán thời gian tạo
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp // Tự động gán thời gian cập nhật
    private LocalDateTime updatedAt;

    // Mối quan hệ: Nhiều bài Blog thuộc về 1 User
    @ManyToOne(fetch = FetchType.LAZY) // LAZY: Chỉ load khi thực sự cần
    @JoinColumn(name = "user_id", nullable = false) // Tên cột khóa ngoại
    private User author;
}
