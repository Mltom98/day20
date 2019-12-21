package dao;

import entity.User;

/**
 * @Author yml
 * Date on 2019/12/21  9:33
 */
public interface UserDao {
    /**
     * 为了前端直接验证该用户是否存在
     * @param username
     * @return
     */
    User check(String username);

    /**
     * 为了直接验证用户名和密码是否一致并存在
     * @param username
     * @param password
     * @return
     */
    User findOne(String username,String password);

}
