/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.Connection;
import java.util.List;
import jdbc.model.Mahasiswa;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ThinkPad
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
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
    }
    
    public Mahasiswa MakeMhsObject(){
        Mahasiswa mhs = new Mahasiswa();
        
        return mhs;
    }
    
    public void add(Mahasiswa mhs){
        
    try {

        String sql = "INSERT INTO mahasiswa(id, nama) VALUES (?, ?)";

        PreparedStatement ps = koneksi.prepareStatement(sql);

        ps.setInt(1, mhs.getId());
        ps.setString(2, mhs.getNama());
       

        ps.executeUpdate();

        System.out.println("Data berhasil ditambahkan");

        } catch (SQLException e) {

            System.out.println("Gagal menambahkan data");
            e.printStackTrace();
        }
    }
    
    public void update(Mahasiswa mhs){
        try {

        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";

        PreparedStatement ps = koneksi.prepareStatement(sql);

        ps.setString(1, mhs.getNama());
        ps.setInt(2, mhs.getId());

        ps.executeUpdate();

        System.out.println("Data berhasil diupdate");

        } catch (SQLException e) {

            System.out.println("Gagal update data");
            e.printStackTrace();
        }
    }
    
public void delete(int id) {

    try {

        String sql = "DELETE FROM mahasiswa WHERE id=?";

        PreparedStatement ps = koneksi.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("Data berhasil dihapus");

    } catch (SQLException e) {

        System.out.println("Gagal menghapus data");
        e.printStackTrace();
    }
}
    
    public Mahasiswa getById(int id){
        Mahasiswa mhs = null;

        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";

            PreparedStatement ps = koneksi.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                mhs = new Mahasiswa();

                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mhs;
    }
    
    public List<Mahasiswa> getAll(){
        
        List<Mahasiswa> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mahasiswa";

            Statement st = koneksi.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Mahasiswa mhs = new Mahasiswa();

                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));

                list.add(mhs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
