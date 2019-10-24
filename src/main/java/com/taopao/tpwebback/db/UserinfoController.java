//package com.taopao.tpwebback.db;
//
//
//import com.taopao.tpwebback.service.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class UserinfoController {
//    @Autowired
//    private UserService mUserService;
//
//    @GetMapping("getUserinfo")
//    @ResponseBody
//    public UserInfo getUserInfo(int id) {
//        UserInfo userInfo = mUserService.get(id);
//
//        return userInfo;
//    }
//}
