package com.hudongwx.drawlottery.mobile.service.user.impl;

import com.hudongwx.drawlottery.mobile.entitys.User;
import com.hudongwx.drawlottery.mobile.mappers.UserMapper;
import com.hudongwx.drawlottery.mobile.service.user.IUserService;
import com.hudongwx.drawlottery.mobile.shiro.AuthorPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DATE:2016/12/14 0014
 * Auth: origin
 * DESC:
 *
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper mapper;

    public User login(String username,String password) {
        User user = new User();
        user.setName(username);
        user.setPasswd(password);
        //模拟数据库加密
        AuthorPasswordService service = new AuthorPasswordService();
        service.encryptUserPassword(user);
        return user;
    }


}