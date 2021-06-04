package com.efub.jpapractice.repository;

import com.efub.jpapractice.domain.Author;
import com.efub.jpapractice.domain.Book;
import com.efub.jpapractice.domain.BookReview;
import com.efub.jpapractice.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookReviewRepository bookReviewRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void bookRelationTest(){
        givenReview(givenUser(), givenBook());

        User user =  userRepository.findByEmail("userA@gmail.com");

        System.out.println("user's review =>" + user.getBookReviews());
        System.out.println("book's review =>" + bookRepository.findAll().get(0).getBookReviews());
        System.out.println(bookReviewRepository.findAll().get(0));
    }

    private User givenUser(){
        User user = new User();
        user.setName("userA");
        user.setEmail("userA@gmail.com");

        return userRepository.save(user);
    }

    private Book givenBook(){
        Book book = new Book();
        book.setName("EFUB");
        book.setCategory("Ewha");

        return bookRepository.save(book);
    }

    private void givenReview(User user, Book book){
        BookReview bookReview = new BookReview();
        bookReview.setTitle("너무 재밌어요");
        bookReview.setContent("너무너무 재미있어요");
        bookReview.setScore(5.0f);
        bookReview.setUser(user);
        bookReview.setBook(book);

        //저장시 사용되지 않고 오로지 객체
        user.getBookReviews().add(bookReview);
        book.getBookReviews().add(bookReview);

        bookReviewRepository.save(bookReview);
    }
}