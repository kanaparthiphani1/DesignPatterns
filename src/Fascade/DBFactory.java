package Fascade;

import java.sql.Connection;

public class DBFactory {
    public static void getReport(DBHelper db, String reportType, String tableName, Connection con){
        switch(reportType){
            case "HTML":
                db.generateHTMLReport(tableName, con);
                break;
            case "PDF":
                db.generatePDFReport(tableName, con);
                break;
        }
    }
}
