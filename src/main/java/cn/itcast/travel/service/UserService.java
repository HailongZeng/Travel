package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author HailongZeng
 * @date 12/25/19 7:40 下午
 */
public interface UserService {


    boolean register(User user);

    boolean active(String code);

    User login(User user);
}
