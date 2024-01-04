package Adapter.ExternalAPI;

public class ICICIBankAPI {
    public int checkBalance(String accNum){
        return 100;
    }

    public boolean transferMoney(String froAcc, String toAcc, double amount){
        return true;
    }
}
