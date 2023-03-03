package lection7_2.Temperature;

import java.util.Scanner;

public class Second_variation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CelsiusNumber = sc.nextInt();
        BaseConverter2 Celsius = new BaseConverter2() {

            @Override
            public void converter2() {
                System.out.println("Celsius: " + CelsiusNumber);
            }
        };
        BaseConverter2 Fahrenheit = new BaseConverter2() {
            double Fahrenheit = (double) CelsiusNumber + 273.15;

            @Override
            public void converter2() {
                System.out.println("Fahrenheit: " + Fahrenheit);
            }
        };
        BaseConverter2 Kelvins = new BaseConverter2() {
            double Kelvins = (double) CelsiusNumber * 1.8 + 32;

            @Override
            public void converter2() {
                System.out.println("Kelvins: " + Kelvins);
            }
        };
        Celsius.converter2();
        Fahrenheit.converter2();
        Kelvins.converter2();
    }
}
