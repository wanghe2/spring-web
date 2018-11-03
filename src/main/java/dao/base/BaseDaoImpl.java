package dao.base;

import dao.base.BaseDao;

import java.util.List;

public class BaseDaoImpl<T1,T2> implements BaseDao<T1,T2> {


    @Override
    public T2 insert(T2 entity) {
        return null;
    }

    @Override
    public T2 update(T2 entity) {
        return null;
    }

    @Override
    public void delete(T1 id) {

    }

    @Override
    public List<T2> getAll() {
        return null;
    }
}
