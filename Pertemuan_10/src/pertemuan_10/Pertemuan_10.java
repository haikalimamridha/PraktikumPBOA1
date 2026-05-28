package pertemuan_10;

import java.sql.Connection;
import java.sql.DriverManager;

public class Pertemuan_10 {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/pbo",
                "root",
                "Haikal313"
            );

            System.out.println("Koneksi berhasil!");

        } catch (Exception e) {
            System.out.println("Koneksi gagal!");
            System.out.println(e.getMessage());
        }
    }
}