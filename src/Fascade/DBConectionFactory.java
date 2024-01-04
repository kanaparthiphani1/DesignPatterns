package Fascade;

import java.sql.Connection;

public interface DBConectionFactory {
    public Connection createDBConnection();
}
