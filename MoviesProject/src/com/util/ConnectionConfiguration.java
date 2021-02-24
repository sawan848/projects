package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * @author:Saawan
 * @created:[2/23/2021],Tuesday
 * Time:5:12 PM
 */
public class ConnectionConfiguration {

    public static Connection getConnection() {
        Connection connection=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection
                    ("jdbc:postgresql://localhost:4444/movies","postgres","hope");

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
