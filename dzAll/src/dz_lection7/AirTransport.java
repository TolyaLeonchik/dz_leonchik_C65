package dz_lection7;

public abstract class AirTransport extends Transport {
    double wingspan;

    double getWingspan() {
        return wingspan;
    }

    int minLength;

    int getMinLength() {
        return minLength;
    }

    public AirTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }

}
