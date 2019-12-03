package com.kcartoon.user.service.impl;

import com.kcartoon.user.bean.UmsMember;
import com.kcartoon.user.mapper.UserMapper;
import com.kcartoon.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberlist = userMapper.selectAllUser();
        return umsMemberlist;
    }
}
