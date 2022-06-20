package org.example;
import java.sql.*;

public class InsertRecords {
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

    public void insert() {
        String sql = "insert into waktu (waktu) values ('15:00'), ('07:30'), ('08:05'), ('17:35'), ('11:01');";
        try{
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
