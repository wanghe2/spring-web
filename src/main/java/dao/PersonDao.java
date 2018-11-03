package dao;


import dao.base.BaseDao;
import entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends BaseDao<Integer, Person> {
}
