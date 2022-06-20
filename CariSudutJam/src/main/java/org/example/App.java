package org.example;

import static org.example.CreateDB.createNewDatabase;
import static org.example.CreateTable.createNewTable;

public class App {
    public static void main( String[] args ) {
        createNewDatabase("waktu.db");

        createNewTable();

        InsertRecords app = new InsertRecords();
        app.insert();

        SudutJam x = new SudutJam();
        x.updateSudut(15,00);
        x.updateSudut(7, 30);
        x.updateSudut(8, 05);
        x.updateSudut(17, 35);
        x.updateSudut(11, 01);

        SelectPrint appp = new SelectPrint();
        appp.selectAll();
    }
}