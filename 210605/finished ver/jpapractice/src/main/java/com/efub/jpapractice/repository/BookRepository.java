package com.efub.jpapractice.repository;

import com.efub.jpapractice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
