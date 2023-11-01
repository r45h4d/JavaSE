public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer("Mercedes");
        car.setNumberOfDoors(5);

        Boat boat = new Boat();
        boat.setManufacturer("Monterey");
        boat.setLength(25);

        System.out.println(car.toString());
        System.out.println(car.toString(true));

        System.out.println(boat.toString());
        System.out.println(boat.toString(true));
    }
}