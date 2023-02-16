package dz_lection4;

import java.util.Scanner;

public class dz4_1 {
    public static void main(String[] args) {
        int[][][] mas = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] = mas[i][j][k] + givenNumber;
                    System.out.print(mas[i][j][k] + " ");
                }
            }
        }
    }
}
