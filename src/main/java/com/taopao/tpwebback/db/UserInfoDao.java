package com.taopao.tpwebback.db;

import com.taopao.tpwebback.bean.UserInfo;

import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    UserInfo get(int id);
}
