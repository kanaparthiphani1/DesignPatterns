package Singleton;

/*
*
* This solves the issue of concurrent threads in Lazy, But what if there are so many threads using, then system will become so slow as every thread will wait.
* This problem will be solved with Double Check
* */
public class DBConnection_Sync {
    private static DBConnection_Sync dbCon;

    private DBConnection_Sync(){

    }

    public synchronized static DBConnection_Sync getDbCon(){
        if(dbCon == null){
            dbCon = new DBConnection_Sync();
        }
        return  dbCon;
    }
}
