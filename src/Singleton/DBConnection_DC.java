package Singleton;

/*
*
* This solves the problem of Sync, as it removes synchronized method and applying sync on block, so if there are so many threads after object is already created
* then they dont even go to sync block as they will fail on first if block and got there object.
*
* But there is one problem, when two threads enter the CS same time then if one creates object, but normal variables creates object inside cache before going into
* real memory, so second thread wont know the object and it will create new, because of that we use volatile variables.
*
* - volatile : Creates/ Updates directly in the memory bypass the cache
*
* But this is also slow, as we are not using cache.
* */
public class DBConnection_DC {
    private static volatile DBConnection_DC dbCon;

    private DBConnection_DC(){

    }

    public static DBConnection_DC getDbCon(){
        if(dbCon == null){
            synchronized (DBConnection_DC.class){
                if(dbCon==null){
                    dbCon = new DBConnection_DC();
                }
            }
        }
        return  dbCon;
    }
}
