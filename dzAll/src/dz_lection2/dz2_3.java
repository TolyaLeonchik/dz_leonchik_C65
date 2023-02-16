package dz_lection2;

public class dz2_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <= 256; x = x * 2) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
