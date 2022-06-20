package org.example;

import static org.example.CreateDB.createNewDatabase;
import static org.example.CreateTable.createNewTable;

public class App {
    public static void main( String[] args ) {
        createNewDatabase("waktu.db");

        createNewTable();

        InsertRecords app = new InsertRecords();
        // insert waktu
        app.insert("15:00");
        app.insert("07:30");
        app.insert("08:05");
        app.insert("17:35");
        app.insert("11:01");

    }
}