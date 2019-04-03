package com.gess.service;

import com.gess.model.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);

    List<User> findAllUser();

    List<User> findUserByPage(int pageNum, int pageSize);
}
