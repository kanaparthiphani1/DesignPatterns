package Fascade;

import java.sql.Connection;

public class MySQLConnection implements DBConectionFactory{

    @Override
    public Connection createDBConnection() {
        //logic
        System.out.println("MYSQL connected");
        return null;
    }
}
