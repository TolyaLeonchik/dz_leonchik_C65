package dz_lection2;

public class dz2_7 {
    public static void main(String[] args) {
        int sumNotEvenNumbers = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) sumNotEvenNumbers = sumNotEvenNumbers + i;
        }
        System.out.println(sumNotEvenNumbers);
    }
}
