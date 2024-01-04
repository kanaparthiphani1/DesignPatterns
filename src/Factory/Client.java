package Factory;

public class Client {
    public static void main(String[] args) {
        Computer c = ComputerFactory.getComputer("PC","8gb","500GB","i5");
        System.out.println(c.toString());

        Computer c2 = ComputerFactory.getComputer("Server","64gb","10TB","i7");
        System.out.println(c2.toString());

    }
}
