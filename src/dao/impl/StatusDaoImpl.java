package dao.impl;

import dao.StatusDao;
import entity.Status;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DruidUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  9:50
 */
public class StatusDaoImpl implements StatusDao {
    private QueryRunner queryRunner=new QueryRunner(DruidUtils.getDs());
    @Override
    public List<Status> findAll() {
        try {
            return queryRunner.query("select * from status ",new BeanListHandler<>(Status.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
