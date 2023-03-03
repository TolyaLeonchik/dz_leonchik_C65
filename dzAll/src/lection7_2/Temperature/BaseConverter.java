package lection7_2.Temperature;

import java.util.Scanner;

public class BaseConverter {
    Scanner sc = new Scanner(System.in);
    int Celsius = sc.nextInt();
    double Fahrenheit;
    double Kelvins;

    void Converter() {
        Fahrenheit = (double) Celsius + 273.15;
        Kelvins = (double) Celsius * 1.8 + 32;
    }

    void display() {
        System.out.println("Celsius: " + Celsius + "'C\tFahrenheit: " + Fahrenheit + "F\tKelvins: " + Kelvins + "K");
    }
}
