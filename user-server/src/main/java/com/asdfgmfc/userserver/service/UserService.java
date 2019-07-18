package com.asdfgmfc.userserver.service;

import com.asdfgmfc.userserver.dataobject.UserInfo;

public interface UserService {
    UserInfo findByOpenid(String openid);
}
