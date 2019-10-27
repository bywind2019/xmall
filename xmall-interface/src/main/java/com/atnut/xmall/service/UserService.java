package com.atnut.xmall.service;

import com.atnut.xmall.UserAddress;
import com.atnut.xmall.UserInfo;

import java.util.List;

public interface UserService {

    // 查询所有用户信息
    List<UserInfo> findAll();
    // 根据用户Id 查询用户地址列表
    List<UserAddress> getUserAddressList(String userId);
}
