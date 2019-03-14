package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class Question6 {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    String getUserName() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{"reshmattn"},String.class);
    }

}
