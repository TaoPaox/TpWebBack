package com.taopao.tpwebback.service;

import com.taopao.tpwebback.bean.UserInfo;
import com.taopao.tpwebback.db.UserInfoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserInfoDao mUserInfoDao;

    public UserInfo get(int id) {
        UserInfo userInfo = mUserInfoDao.get(id);
        return userInfo;
    }
}
