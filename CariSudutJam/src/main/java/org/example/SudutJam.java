package org.example;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SudutJam {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:/waktu.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void updateSudut(double jam, double menit) {
        // Validasi Inputan
        if (jam < 0 || menit < 0 || menit > 60) {
            System.out.println("Inputan Salah, silahkan coba lagi!");
        }
        double sudutJam = (0.5 * (jam * 60 + menit));
        double sudutMenit = (6 * menit);
        double sudutt = Math.abs(sudutJam - sudutMenit);
        sudutt = Math.min(360 - sudutt, sudutt);
        double suduttt = Math.abs(sudutt);

        int i = (int)jam;
        String jamm = String.valueOf(i);
        System.out.println("Sudut: "+suduttt+" sudah diupdate!");

        //

        String sql = "UPDATE waktu SET sudut = "+suduttt+" WHERE WAKTU LIKE '%"+jamm+"%';";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            stmt.executeQuery(sql);
        } catch (SQLException e) {

        }

    }
}
