package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @author HailongZeng
 * @date 12/25/19 7:42 下午
 */
public interface UserDao {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User findByUsername(String username);

    public void save(User user);

    void updateStatus(User user);

    User findByCode(String code);

    User findByUsernameAndPassword(String username, String password);
}
