package Decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new LuxuryCarDecorator(new SportsCarDecorator(new BasicCar()));
        car.assemble();

        Car car2 = new LuxuryCarDecorator(new BasicCar());
        car2.assemble();
    }
}
