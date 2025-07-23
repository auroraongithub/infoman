package com.mycompany.esystem;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ESystem {
    
    public static Connection con;
    public static Statement st;
    public static ResultSet rs;
    
    static String db;
    static String uname;
    static String pswd;

    public static void main(String[] args) {
        DBConnect();
        StudentsForm a = new StudentsForm();
        a.setVisible(true);
    }
    
    public static void DBConnect() {
    try {
        String db = "1stSem_Sy2025_2026";
        String uname = "root";
        String pswd = "seansean321";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
            "jdbc:mysql://10.4.44.106:3306/" + db + "?zeroDateTimeBehavior=CONVERT_TO_NULL",
            uname,
            pswd
        );
        st = con.createStatement();
        System.out.println("Connected");
    } catch (Exception e) {
        System.out.println("Unexpected error.");
        e.printStackTrace();
        }
    }
}
