package dao;

import entity.Status;

import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  9:36
 */
public interface StatusDao {
    /**
     * 查询所有 并返回结果集
     * @return List<Status>
     */
    List<Status> findAll();
}
