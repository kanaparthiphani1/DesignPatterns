package Fascade;

import java.sql.Connection;

public class MySQLHelper implements DBHelper {
    public void generatePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("HTML Generated");
    }
}
