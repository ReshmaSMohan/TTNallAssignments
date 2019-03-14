package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Date;

@Repository
public class UserDao {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao2 userDao2;

    @Transactional(propagation = Propagation.REQUIRED,timeout = 2,rollbackFor = IndexOutOfBoundsException.class)
    public void insert() {
/*  //for timeout
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "xyz", "xyz", "xyz", 1, new Date()
        });
        try {
            userDao2.insert();
        } catch (Exception ex) {
            System.out.println("dao 2 exception in dao 1");
        }

       readOnlyDemo();
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly=true)
    public void readOnlyDemo(){
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "read", "xyz", "xyz", 1, new Date()
        });
    }
}
