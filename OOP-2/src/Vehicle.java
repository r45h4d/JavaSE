public abstract class Vehicle {
    private String manufacturer;
    abstract void move();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
