package Adapter;

import Adapter.ExternalAPI.HdfcBankAPI;

public class HDFCBankAPIImpl implements BankAPIAdapter{

    HdfcBankAPI api = new HdfcBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return api.verifyBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return api.payMoney(fromAccount, toAccount, amount);
    }
}
