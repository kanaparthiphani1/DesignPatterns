package Singleton;

/*
*
* This is Eager initialization method, where we define static variable and initialize that when declaring so that it will initialize when app loading.
* But the problem comes because even when we don't use DBConnection Object we still create Object. We will be resolving using Lazy Initialization
*
* */
public class DBConnection_Eager {
    private static DBConnection_Eager dbCon = new DBConnection_Eager();

    private DBConnection_Eager(){

    }

    public static DBConnection_Eager getDbCon(){
        return dbCon;
    }
}
