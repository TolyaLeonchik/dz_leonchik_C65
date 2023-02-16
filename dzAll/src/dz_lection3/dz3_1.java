package dz_lection3;

import java.util.Scanner;

public class dz3_1 {
    public static void main(String[] args) {
        int[] mass = new int[]{13, 5, 7, 11, 1, 0, 4};

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean result = false;

        System.out.print("Дан массив: {");

        for (int i = 0; i < mass.length; i++) {
            if (i != mass.length - 1) System.out.print(mass[i] + ", ");
            else System.out.println(mass[i] + "}");
        }

        for (int i = 0; i < mass.length; i++) {
            if (x == mass[i]) {
                result = true;
                System.out.println("Число " + x + " есть в массиве");
                break;
            }
        }
        if (result == false) System.out.println("Числа " + x + " нету в массиве");
    }
}
