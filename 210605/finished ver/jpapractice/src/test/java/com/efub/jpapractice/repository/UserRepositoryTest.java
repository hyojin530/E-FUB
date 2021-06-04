package com.efub.jpapractice.repository;

import com.efub.jpapractice.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void updateTest(){
        insertUser();

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        System.out.println("Before update =>"+user);

        user.setEmail("userA@naver.com");
        userRepository.save(user);  //update 설명을 해말아...

        System.out.println("After update =>"+userRepository.findAll().get(0));
    }

    private void insertUser(){
        User user1 = givenUser("userA", "userA@gmail.com");
        User user2 = givenUser("userB", "userB@gmail.com");
        User user3 = givenUser("userC", "user3@gmail.com");

        userRepository.saveAll(Lists.newArrayList(user1, user2, user3));
    }

    private User givenUser(String name, String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);

        return userRepository.save(user);
    }
}