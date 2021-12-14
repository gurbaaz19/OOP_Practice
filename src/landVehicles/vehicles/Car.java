package landVehicles.vehicles;

import landVehicles.VehicleClass;
import landVehicles.VehicleInterface;

public class Car extends VehicleClass implements VehicleInterface {
    int fuel;
    static int FUEL_CAPACITY = 100;

    public Car() {
        fuel = 50;
    }

    public int calculateMaintenanceCost() {
        return FUEL_CAPACITY - fuel;
    }

}
