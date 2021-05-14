package com.efub.efubCRUDexample;

import com.efub.efubCRUDexample.dao.UserDAO;
import com.efub.efubCRUDexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class sample {
    @Resource(name="userService")
    private UserService userService;

}
