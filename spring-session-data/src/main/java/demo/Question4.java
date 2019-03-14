package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class Question4 {

    @Autowired
    DataSource dataSource;

    void printUserDetails() throws SQLException {

        Connection connection = dataSource.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT username FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("--USERNAME--");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
    }

}