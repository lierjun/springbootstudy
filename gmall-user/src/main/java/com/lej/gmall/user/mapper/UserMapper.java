package com.lej.gmall.user.mapper;

import com.lej.gmall.user.bean.UserMember;

import java.util.List;

public interface UserMapper {
    List<UserMember> selectAllUser();
}
