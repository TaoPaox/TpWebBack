package com.taopao.tpwebback.db;

import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    UserInfo get(int id);
}
