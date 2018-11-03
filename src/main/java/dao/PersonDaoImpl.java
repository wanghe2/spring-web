package dao;

import dao.base.BaseDaoImpl;
import dao.base.BaseJdbcTmp;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 本来想设计一个BaseDaoImpl做底层实现，整体用jdbcTemplate去实现，或者用hibernate框架实现
 * 不过此项目打算在数据层使用mybatis框架实现
 * 所以对dao层接口不再需要具体的实现类，而是采用xml去映射sql语句
 */
//@Repository
public class PersonDaoImpl extends BaseDaoImpl<Integer,Person> {

    @Autowired
    private BaseJdbcTmp baseJdbcTmp;

    @Override
    public Person insert(Person entity) {
        return null;
    }

    @Override
    public Person update(Person entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Person> getAll() {
        List<Map<String, Object>> datas=baseJdbcTmp.queryForList("select * from person");
        System.err.println(baseJdbcTmp.getClass());
        for(Map<String,Object> data:datas){
            System.err.println(data.get("FIRSTNAME"));
        }
       return null;
    }

}
