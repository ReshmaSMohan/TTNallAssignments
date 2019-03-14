package demo;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDAO {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SessionFactory sessionFactoryBean;

    void queryForMap() {
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"reshmattn"}));
    }

    void queryForList() {
        String sql = "SELECT * FROM user";
        System.out.println(jdbcTemplate.queryForList(sql));
    }

    user getUser(String name) {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, new UserMapper());
    }

    void sessionFactoryDemo() {
        String sql = "SELECT COUNT(*) FROM user";
        Query query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }

}
