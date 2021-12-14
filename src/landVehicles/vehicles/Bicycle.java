package landVehicles.vehicles;

import landVehicles.VehicleClass;
import landVehicles.VehicleInterface;

public class Bicycle extends VehicleClass implements VehicleInterface {
    int air;
    static int AIR_CAPACITY = 20;

    public Bicycle() {
        air = 10;
    }

    public int calculateMaintenanceCost() {
        return AIR_CAPACITY - air;
    }
}
