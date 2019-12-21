package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

/**
 * @Author yml
 * Date on 2019/12/21  10:17
 */
public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public User check(String username) {
        return dao.check(username);
    }

    @Override
    public User findOne(String username, String password) {
        return dao.findOne(username,password);
    }
}
