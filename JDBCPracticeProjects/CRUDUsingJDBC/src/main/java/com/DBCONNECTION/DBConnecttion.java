package com.DBCONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnecttion {
    private static final String URL="jdbc:postgresql://localhost:5432/CRUD_Proj_DB";
    private static final String UNAME="postgres";
    private static final String pass="1234";
    public static Connection establishConection(){

        try {
            Connection con = DriverManager.getConnection(URL, UNAME, pass);
            System.out.println("Database connection established successfully....");
            return con;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}
