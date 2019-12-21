package service;

import entity.Status;

import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  9:54
 */
public interface StatusService {
    /**
     * 查询所有 并返回结果集
     * @return List<Status>
     */
    List<Status> findAll();
}
