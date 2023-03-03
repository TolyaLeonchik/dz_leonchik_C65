package dz_lection7;

import java.util.Scanner;

public class FreightCar extends GroundTransport {
    double loadCapacity;

    public FreightCar(int power, int maxSpeed, int weight, String model, int wheelNumber, double fuelConsumption, double loadCapacity) {
        super(power, maxSpeed, weight, model, wheelNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void display() {
        System.out.printf("Грузовой автомобиль марки: %s \t Грузоподъёмность: %.1f т\tКол-во колес: %d \t" +
                        " Мощность: %d л.с.\t Макс. скорость: %d км/ч\nРасход топлива: %.1f л/100 км\t" +
                        " Масса: %d кг\n", super.getModel(), loadCapacity, super.getWheelNumber(),
                super.getPower(), super.getMaxSpeed(), super.getFuelConsumption(), super.getWeight());
    }

    public void checkLoadCapacity() {
        System.out.print("Введите кол-во груза (т): ");
        Scanner sc = new Scanner(System.in);
        double load = sc.nextDouble();
        if (load <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
