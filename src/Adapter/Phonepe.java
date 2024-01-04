package Adapter;

public class Phonepe {
    private BankAPIAdapter bankAPI;

    public Phonepe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    double checkBalance() {
        double currentBalance = bankAPI.getBalance("accountNumber");
        return currentBalance;
    }
}
