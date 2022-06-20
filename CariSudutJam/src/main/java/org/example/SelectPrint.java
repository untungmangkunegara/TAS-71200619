package org.example;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectPrint {
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
    public void selectAll(){
        String sql = "SELECT * FROM waktu";

        try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            // loop through the result set
            System.out.println("Nomor"+"\t"+"Waktu"+"\t"+"Sudut");
            while (rs.next()) {
                System.out.println(rs.getInt("nomor") +  "\t" +
                        rs.getString("waktu") + "\t" +
                        rs.getDouble("sudut"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
