package com.kcartoon.user.service;

import com.kcartoon.user.bean.UmsMember;
import com.kcartoon.user.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
