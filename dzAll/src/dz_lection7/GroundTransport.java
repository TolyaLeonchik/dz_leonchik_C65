package dz_lection7;

public abstract class GroundTransport extends Transport {
    int wheelNumber;

    int getWheelNumber() {
        return wheelNumber;
    }

    double fuelConsumption;

    double getFuelConsumption() {
        return fuelConsumption;
    }

    public GroundTransport(int power, int maxSpeed, int weight, String model, int wheelNumber, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.wheelNumber = wheelNumber;
        this.fuelConsumption = fuelConsumption;
    }
}
