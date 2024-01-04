package Fascade;

import java.sql.Connection;

public class OracleConnection implements DBConectionFactory{
    @Override
    public Connection createDBConnection() {
        //logic

        System.out.println("Oracle DB connected");
        return null;
    }
}
