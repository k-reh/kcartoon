package com.kcartoon.user.mapper;

import com.kcartoon.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();
}
