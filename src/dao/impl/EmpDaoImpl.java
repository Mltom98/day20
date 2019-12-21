package dao.impl;

import dao.EmpDao;
import entity.Emp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DruidUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  9:43
 */
public class EmpDaoImpl implements EmpDao {
    private QueryRunner queryRunner=new QueryRunner(DruidUtils.getDs());
    @Override
    public List<Emp> findALl() {
        try {
            return queryRunner.query("select * from  emp ;",new BeanListHandler<>(Emp.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Emp findOne(int id) {
        try {
            return queryRunner.query("select * from emp where id=?",new BeanHandler<>(Emp.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insert(Emp emp) {
        try {
            return queryRunner.update("insert into emp (id,username,dept,chkDate,sid) values(?,?,?,?,?)",emp.getId(),emp.getUsername(),emp.getDept(),emp.getChkDate(),emp.getSid());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int delete(int id) {
        try {
            return queryRunner.update("delete from emp where id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Emp emp) {
        try {
            return queryRunner.update("update emp set username=?,dept=?,chkDate=?,sid=? where id=?",emp.getUsername(),emp.getDept(),emp.getChkDate(),emp.getSid(),emp.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
