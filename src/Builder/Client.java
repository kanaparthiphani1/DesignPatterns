package Builder;

public class Client {
    public static void main(String[] args) {
        House h1 = House.getBuilder().setColor("White").setFloorType("Marble").setNooFDoors(2).setNoOfWindows(4).setGaragePresent(true).build();
        House h2 = House.getBuilder().setColor("Blue").setFloorType("Wood").setNooFDoors(3).setNoOfWindows(1).build();

        System.out.println("House 1 "+ h1.toString());
        System.out.println("House 2 "+ h2.toString());

    }
}
