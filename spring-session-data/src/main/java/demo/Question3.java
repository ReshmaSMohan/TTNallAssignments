package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class Question3 {

    @Autowired
    DataSource dataSource;

    @Autowired
    DataSource pooledSource;

    void printUserDetails() throws SQLException {

        //DriverManagerDataSource
       // Connection connection = dataSource.getConnection();

        //dbcp2.BasicDataSource
        Connection connection = pooledSource.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT name FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("--Name--");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

}
