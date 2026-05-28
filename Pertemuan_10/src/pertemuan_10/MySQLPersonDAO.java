package pertemuan_10;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {

        String name = person.getName();

        // load driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // koneksi database
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/pbo",
                "root",
                ""
        );

        System.out.println("Koneksi berhasil!");

        // query insert
        String query = "INSERT INTO person(name) VALUES('" + name + "')";

        System.out.println(query);

        Statement s = con.createStatement();

        int hasil = s.executeUpdate(query);

        // cek insert berhasil
        if (hasil > 0) {
            System.out.println("Data berhasil ditambahkan");
        }

        con.close();
    }
}