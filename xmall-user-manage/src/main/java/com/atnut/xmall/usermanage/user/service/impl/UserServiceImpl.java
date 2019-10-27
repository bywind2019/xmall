package com.atnut.xmall.usermanage.user.service.impl;

import com.atnut.xmall.UserAddress;
import com.atnut.xmall.UserInfo;
import com.atnut.xmall.service.UserService;
import com.atnut.xmall.usermanage.user.mapper.UserAddressMapper;
import com.atnut.xmall.usermanage.user.mapper.UserInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // 调用mapper
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        //  select * from userAddress where userId = ?
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);

        return userAddressMapper.select(userAddress);

//        Example example = new Example(UserAddress.class);
//        example.createCriteria().andEqualTo("userId",userId);
//        return userAddressMapper.selectByExample(example);

    }

}