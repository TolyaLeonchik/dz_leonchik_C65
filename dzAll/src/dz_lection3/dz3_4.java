package dz_lection3;

import java.util.Scanner;

public class dz3_4 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double avg1;
        double avg2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 значений для 1-ого массива:");
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = sc.nextInt();
            sum1 = sum1 + mas1[i];
            System.out.print("" + mas1[i] + " ");
        }

        System.out.println("\n" + "Введите 5 значений для 2-ого массива:");
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = sc.nextInt();
            sum2 = sum2 + mas2[i];
            System.out.print("" + mas2[i] + " ");
        }
        avg1 = (double) sum1 / 5;
        avg2 = (double) sum2 / 5;

        if (avg1 > avg2)
            System.out.println("\n" + "Арифметическое среднее значение 1-ого массива больше, его значение: " + avg1);
        else if (avg1 < avg2) {
            System.out.println("\n" + "Арифметическое среднее значение 2-ого массива больше, его значение: " + avg2);
        } else
            System.out.println("\n" + "Арифметические средние значения массивов равны между собой и это значение: " + avg1);
    }
}
