package Adapter;

public class Client {
    public static void main(String[] args) {
        Phonepe pp = new Phonepe(new ICICIBankAPIImpl()); // can implement Factory or Abstract Factory
        System.out.println("Balance : "+pp.checkBalance() );
    }
}
