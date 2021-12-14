package landVehicles;

public abstract class VehicleClass {
    protected int position;
    protected int speed;

    public int moveForward(int steps) {
        position += steps;
        return position;
    }

    public int moveBack(int steps) {
        position -= steps;
        return position;
    }
}
