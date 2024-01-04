package Decorator;

public class SportsCarDecorator extends CarDecorator{

    SportsCarDecorator(Car car){
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added SportsCar feature");
    }
}
