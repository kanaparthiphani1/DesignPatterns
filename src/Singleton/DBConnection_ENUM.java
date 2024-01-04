package Singleton;

public enum DBConnection_ENUM {
    GET_INSTANCE;

    private boolean isConnected;

    private DBConnection_ENUM(){

    }

    public void connect(){
        if(!isConnected){
            //connection logic

        }else{
            //already connected
        }
    }

    //Other methods specific to DB
}
