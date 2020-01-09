package cn.springbootjpajwt.demo.service;

import cn.springbootjpajwt.demo.entity.User;


public interface AuthService {

    User register(User userToAdd);
    String login(String username, String password);
}
