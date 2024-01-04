package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ComputerAbstractFactory caf = new PCFactory("8gb","500gb","i5");
        Computer c = ComputerFactory.getComputer(caf);
        System.out.println(c.toString());

        ComputerAbstractFactory caf2 = new PCFactory("64gb","500tb","i7");
        Computer c2 = ComputerFactory.getComputer(caf2);
        System.out.println(c2.toString());

    }
}
