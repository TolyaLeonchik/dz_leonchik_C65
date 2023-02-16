package dz_lection3;

import java.util.Scanner;

public class dz3_2 {
    public static void main(String[] args) {
        int[] mass = new int[]{13, 5, 7, 5, 1, 5, 4};

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean result = false;
        int l = 0;
        int y = 0;
        int j = 0;
        System.out.print("Дан массив: {");

        for (int i = 0; i < mass.length; i++) {
            if (i != mass.length - 1)
                System.out.print(mass[i] + ", ");
            else
                System.out.println(mass[i] + "}");
        }

        for (int i = 0; i < mass.length; i++) {
            j = mass.length;
            if (x == mass[i]) {
                l++;
                result = true;
            }
        }
        int[] resultMass = new int[j - l];

        if (result == false) {
            System.out.println("Вашего числа в массиве нету");
        } else {
            System.out.print("Получен массив: ");

            for (int i = 0; i < mass.length; ) {
                if (mass[i] != x) {
                    resultMass[y] = mass[i];
                    i++;
                    y++;
                } else
                    i++;
            }
            for (int m = 0; m < j - l; m++) {
                System.out.print(resultMass[m] + " ");
            }
        }
    }
}
