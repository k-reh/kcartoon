package com.kcartoon.service;

import com.kcartoon.bean.UmsMember;
import com.kcartoon.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
