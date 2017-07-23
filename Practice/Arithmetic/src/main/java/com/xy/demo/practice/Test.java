package com.xy.demo.practice;

import java.sql.*;

/**
 * Created by xy on 2017/3/4.
 */
public class Test {
    public void jdbcTest() throws SQLException {
        Connection connection = DriverManager.getConnection("");
        Statement statement = connection.createStatement();
        statement.execute("");
        ResultSet resultSet = statement.getResultSet();
    }

    public <T extends Object> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t = c.newInstance();
        return t;
    }
}
