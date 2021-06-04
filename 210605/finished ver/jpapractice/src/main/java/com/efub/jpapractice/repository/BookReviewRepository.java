package com.efub.jpapractice.repository;

import com.efub.jpapractice.domain.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview, Long> {
}
