public class Car extends LandVehicle{
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }

    public String toString(boolean showManufacturer) {
        return "Car{" +
                "manufacturer=" + getManufacturer() +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}