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

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("username : password : name : age : dob");
        while (resultSet.next()) {
            System.out.print(resultSet.getString("username")+" : ");
            System.out.print(resultSet.getString("password")+" : ");
            System.out.print(resultSet.getString("name")+" : ");
            System.out.print(resultSet.getInt("age")+" : ");
            System.out.print(resultSet.getDate("dob")+"\n");
        }
    }

}
