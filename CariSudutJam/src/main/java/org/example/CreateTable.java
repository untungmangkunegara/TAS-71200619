package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:/waktu.db";

        // SQL statement for creating a new table
        String sql = "create table waktu (" +
                "nomor integer not null constraint waktu_pk primary key autoincrement, " +
                "waktu text not null, " +
                "sudut real null );";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
