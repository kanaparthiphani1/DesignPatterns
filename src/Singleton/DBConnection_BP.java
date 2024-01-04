package Singleton;

/*
*
* This solution is fast, its just an extension to the eager initialization as it resolves the problem with eager. Bill Pugh
* */
public class DBConnection_BP {
    private DBConnection_BP(){

    }

    private static class DBConnectionInner{
        private static DBConnection_BP dbCon = new DBConnection_BP();
    }

    public static DBConnection_BP getDbCon(){
        return DBConnectionInner.dbCon;
    }
}
