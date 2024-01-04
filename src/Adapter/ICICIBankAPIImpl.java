package Adapter;

import Adapter.ExternalAPI.ICICIBankAPI;

public class ICICIBankAPIImpl implements BankAPIAdapter{

    ICICIBankAPI api = new ICICIBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return api.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return api.transferMoney(fromAccount, toAccount, amount);
    }
}
