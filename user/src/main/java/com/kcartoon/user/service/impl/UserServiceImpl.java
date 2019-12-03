package com.kcartoon.user.service.impl;

import com.kcartoon.user.bean.UmsMember;
import com.kcartoon.user.bean.UmsMemberReceiveAddress;
import com.kcartoon.user.mapper.UmsMemberReceiveAddressMapper;
import com.kcartoon.user.mapper.UserMapper;
import com.kcartoon.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
//        List<UmsMember> umsMemberlist = userMapper.selectAllUser();
        List<UmsMember> umsMemberlist = userMapper.selectAll();
        return umsMemberlist;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }
}
