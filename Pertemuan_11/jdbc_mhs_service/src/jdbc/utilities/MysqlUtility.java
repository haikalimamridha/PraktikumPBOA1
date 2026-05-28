/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author ThinkPad
 */
public class MysqlUtility {
    private static Connection koneksi;
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3307/jdbc_mhs";
                String user= "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("koneksi berhasil");
                }
            } catch (ClassNotFoundException cne){
                System.out.println("gagal load server");
            } catch (SQLException sqle){
                System.out.println("gagal koneksi");
            }
        }
        return koneksi;
    }
}
