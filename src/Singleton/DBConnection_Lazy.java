package Singleton;
/*
*
* This is Lzy Initialization, where we create object in method not while declaration, it solves the previous problem with Eager. But it
* comes with another problem, what if two threads comes at same time at the if block, then two objects will be created. This problem will be resolved by
* Synchronized methods
*
 */
public class DBConnection_Lazy {
    private static DBConnection_Lazy dbCon;

    private DBConnection_Lazy(){

    }

    public static DBConnection_Lazy getDbCon(){
         if(dbCon == null){
             dbCon = new DBConnection_Lazy();

         }
         return  dbCon;
    }
}
