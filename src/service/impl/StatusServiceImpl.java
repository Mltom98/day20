package service.impl;

import dao.StatusDao;
import dao.impl.StatusDaoImpl;
import entity.Status;
import service.StatusService;

import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  10:16
 */
public class StatusServiceImpl implements StatusService {
    private StatusDao dao=new StatusDaoImpl();
    @Override
    public List<Status> findAll() {
        return dao.findAll();
    }
}
