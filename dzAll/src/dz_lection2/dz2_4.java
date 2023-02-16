package dz_lection2;

import java.util.Scanner;

public class dz2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i < secondNumber) {
            sum = sum + firstNumber;
            i++;
        }
        System.out.println(sum);
    }
}
