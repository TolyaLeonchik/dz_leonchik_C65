package dz_lection7;

public abstract class Transport {
    int power;

    int getPower() {
        return power;
    }

    int maxSpeed;

    int getMaxSpeed() {
        return maxSpeed;
    }

    int weight;

    int getWeight() {
        return weight;
    }

    String model;

    String getModel() {
        return model;
    }

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public abstract void display();

    public double kVt() {
        double kVt = (double) power * 0.74;
        System.out.println("Мощность в кВт: " + power + " л.с. = " + kVt + " кВт\n");
        //System.out.printf("Мощность в кВт: %d л.с. = %.2f кВт", power, kVt);
        return kVt;
    }
}
