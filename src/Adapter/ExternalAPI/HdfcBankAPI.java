package Adapter.ExternalAPI;

public class HdfcBankAPI {
    public int verifyBalance(String accNum){
        return 222;
    }

    public boolean payMoney(String froAcc, String toAcc, double amount){
        return true;
    }
}
