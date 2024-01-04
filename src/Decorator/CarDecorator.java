package Decorator;

//Decorator
public class CarDecorator implements Car{

    private Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
