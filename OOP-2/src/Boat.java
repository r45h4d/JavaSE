public class Boat extends WaterVehicle{
    private int length;
    private String motorType;
    private int capacity;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "length=" + length +
                ", motorType='" + motorType + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String toString(boolean showManufacturer)
    {
        return "Boat{" +
                "manufacturer=" + getManufacturer() +
                ", length=" + length +
                ", motorType='" + motorType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
