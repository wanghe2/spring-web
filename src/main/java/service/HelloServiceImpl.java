package service;

import dao.PersonDao;
import entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

@Component
public class HelloServiceImpl implements Hello {

    @Autowired
    private PersonDao personDao;

    @Override
    public void sayhello(){
        System.err.println("good good study");
        System.err.println("day  day  up");
//        queryBymybatis();
        queryByspringbatis();
    }

    /**
     * spring 与 mybatis 集成
     */
    public void queryByspringbatis(){
        List<Person>personList =personDao.getAll();
        for(Person person:personList){
            System.err.println(" wang  --"+person.getId()+"  "+person.getFirstname()+"  "+person.getDeptid()+" "+person.getDowork());
        }
    }



    /**
     * 使用传统的mybatis(未集成到spring)去操作数据库，采用的是xml+接口的形式
     * 不过用不着了，利用spring去集成mybatis会很方便
     */
    public void queryBymybatis(){
        try {

            Reader reader= Resources.getResourceAsReader("mybatis.xml");
            SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=sessionFactory.openSession();
            personDao=session.getMapper(PersonDao.class);
            List<Person>personList =personDao.getAll();
            for(Person person:personList){
                System.err.println(person.getId()+"  "+person.getFirstname()+"  "+person.getDeptid()+" "+person.getDowork());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

