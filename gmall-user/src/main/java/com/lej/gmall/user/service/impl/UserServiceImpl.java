package com.lej.gmall.user.service.impl;

import com.lej.gmall.user.bean.UserMember;
import com.lej.gmall.user.mapper.UserMapper;
import com.lej.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserMember> getAllUser() {
        List<UserMember> userMembers = userMapper.selectAllUser();
        return userMembers;
    }
}
