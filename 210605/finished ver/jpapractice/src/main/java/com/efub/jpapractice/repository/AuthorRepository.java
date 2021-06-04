package com.efub.jpapractice.repository;

import com.efub.jpapractice.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
