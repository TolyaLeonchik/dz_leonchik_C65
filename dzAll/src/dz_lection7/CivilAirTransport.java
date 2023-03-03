package dz_lection7;

import java.util.Scanner;

public class CivilAirTransport extends AirTransport {
    int passengerNumber;
    boolean businessClass;

    public CivilAirTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minLength,
                             int passengerNumber, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minLength);
        this.passengerNumber = passengerNumber;
        this.businessClass = businessClass;
    }

    @Override
    public void display() {
        System.out.printf("Гражданский самолет марки: %s \t Наличие бизнес класса: %b \t Кол-во пассажиров: %d \t" +
                        " Размах крыльев: %.1f \t Мощность: %d л.с.\nМакс. скорость: %d км/ч\t " +
                        "Мин. длина взлётно-посадочной полосы для взлёта: %d м\tМасса: %d кг\n",
                super.getModel(), businessClass, passengerNumber, super.getWingspan(),
                super.getPower(), super.getMaxSpeed(), super.getMinLength(), super.getWeight());
    }

    public void checkLoadPlaces() {
        System.out.print("Введите кол-во человек: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= passengerNumber) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}