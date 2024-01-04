package Fascade;

public class Client {
    public static void main(String[] args) {
        DBConectionFactory fac = new MySQLConnection();
        DBFactory.getReport(new MySQLHelper(),"HTML","users",fac.createDBConnection());
    }
}
