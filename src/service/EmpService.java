package service;

import entity.Emp;

import java.util.List;

/**
 * @Author yml
 * Date on 2019/12/21  9:55
 */
public interface EmpService {
    /**
     * 查询所有并返回结果集
     * @return List<Emp>
     */
    List<Emp> findALl();

    /**
     * 通过员工id进行查找并返回该员工
     * @param id
     * @return Emp
     */
    Emp findOne(int id);

    /**
     * 员工的新增
     * @param json
     * @return 返回成功或者失败 1 或者0
     */
    int insert(String json);

    /**
     * 通过员工id来进行删除
     * @param id
     * @return 返回删除结果 1或者 0
     */
    int delete(int id);

    /**
     * 对员工信息进行修改
     * @param json
     * @return  返回修改结果，1或者0
     */
    int update(String json);
}
