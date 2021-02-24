package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author:Saawan
 * @created:[2/23/2021],Tuesday
 * Time:7:07 AM
 */
public class ConnectDB {

    private static final String url="jdbc:postgresql://localhost:4444/postgres";
    private static final String username="postgres";
    private static final String password="hope";

    public static void main(String[] args) {
        Connection connect=null;

        try {
            Class.forName("org.postgresql.Driver");
            connect= DriverManager.getConnection(url,username,password);
            if (connect!=null){
                System.out.println("Connected (o_o)");
            }else {
                System.out.println("failed ..(o-o)!!!");
            }

        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e);
        }

    }
}
