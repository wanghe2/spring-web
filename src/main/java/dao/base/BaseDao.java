package dao.base;

import servlet.Helloservlet;

import java.util.List;

public interface BaseDao<T1,T2> {
    /**
     * 增
     * @param entity
     * @return
     */
    public T2 insert(T2 entity);

    /**
     * 改
     * @param entity
     * @return
     */
    public T2 update(T2 entity);

    /**
     * 删
     * @param id
     */
    public void delete(T1 id);

    /**
     * 查
     * @return
     */
    public List<T2> getAll();

}
