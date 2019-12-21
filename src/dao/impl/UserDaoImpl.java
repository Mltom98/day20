package dao.impl;

import dao.UserDao;
import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.DruidUtils;

import java.sql.SQLException;

/**
 * @Author yml
 * Date on 2019/12/21  9:48
 */
public class UserDaoImpl implements UserDao {
    private QueryRunner queryRunner=new QueryRunner(DruidUtils.getDs());
    @Override
    public User check(String username) {
        try {
            return queryRunner.query("select * from user where username=?",new BeanHandler<>(User.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User findOne(String username, String password) {
        try {
            return queryRunner.query("select * from user where username=? and password=?",new BeanHandler<>(User.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
