package service.impl;

import com.alibaba.fastjson.JSON;
import dao.EmpDao;
import dao.impl.EmpDaoImpl;
import entity.Emp;
import service.EmpService;

import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  9:56
 */
public class EmpServiceImpl implements EmpService {
    private EmpDao dao=new EmpDaoImpl();
    @Override
    public List<Emp> findALl() {
        return dao.findALl();
    }

    @Override
    public Emp findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public int insert(String json) {
        Emp emp = JSON.parseObject(json, Emp.class);
        return dao.insert(emp);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public int update(String json) {
        Emp emp = JSON.parseObject(json, Emp.class);
        return dao.update(emp);
    }
}
