package com.asdfgmfc.userserver.service.impl;

import com.asdfgmfc.userserver.dataobject.UserInfo;
import com.asdfgmfc.userserver.repository.UserInfoRepository;
import com.asdfgmfc.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
