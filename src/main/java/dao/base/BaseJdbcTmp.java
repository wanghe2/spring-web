package dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;

import javax.sql.DataSource;
//@Component
public class BaseJdbcTmp extends JdbcTemplate {

    @Autowired
    public BaseJdbcTmp(DataSource dataSource){
        super(dataSource);
    }
}

