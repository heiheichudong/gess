package com.gess.service.serviceImpl;

import com.gess.mapper.UserMapper;
import com.gess.model.User;
import com.gess.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> docs = userMapper.selectAllUser();
        PageInfo<User> pageInfo = new PageInfo<>(docs);
        System.out.printf("pageNum %d pageSize %d",pageNum, pageSize);
        System.out.println();
        System.out.print("users = " + pageInfo);
        return pageInfo;
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<User> findUserByPage(int pageNum, int pageSize) {
        return userMapper.selectAllUser();
    }
}
