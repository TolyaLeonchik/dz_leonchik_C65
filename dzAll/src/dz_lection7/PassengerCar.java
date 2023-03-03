package dz_lection7;

import java.util.Scanner;

public class PassengerCar extends GroundTransport {
    String bodyType;
    int passengerNumber;

    public PassengerCar(int power, int maxSpeed, int weight, String model, int wheelNumber, double fuelConsumption,
                        String bodyType, int passengerNumber) {
        super(power, maxSpeed, weight, model, wheelNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        System.out.printf("Легковой автомобиль марки: %s \t Тип кузова: %s \t Кол-во пассажиров: %d \t" +
                        " Кол-во колес: %d \t Мощность: %d л.с.\t Макс. скорость: %d км/ч\nРасход топлива: %.1f л/100 км\t" +
                        " Масса: %d кг\n", super.getModel(), bodyType, passengerNumber, super.getWheelNumber(),
                super.getPower(), super.getMaxSpeed(), super.getFuelConsumption(), super.getWeight());
    }

    @Override
    public double kVt() {
        return super.kVt();
    }

    int time;
    int path;

    double fuel;

    private void fuelPath() {
        System.out.print("Введите время: ");
        time = sc.nextInt();
        path = time * maxSpeed;
        fuel = time * fuelConsumption;
    }

    public void displayFuelPath() {
        fuelPath();
        System.out.printf("За время %d ч, автомобиль %s двигаясь с максимальной скоростью %d км/ч" +
                " проедет %d км и израсходует %.2f литров топлива.\n", time, getModel(), getMaxSpeed(), path, fuel);
    }
}
