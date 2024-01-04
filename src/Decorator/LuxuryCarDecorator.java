package Decorator;

public class LuxuryCarDecorator extends CarDecorator{

    LuxuryCarDecorator(Car car){
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added Luxury Feature");
    }
}
