package dz_lection2;

public class dz2_5 {
    public static void main(String[] args) {
        double sm = 2.54;
        System.out.println("Таблица перевода из дюйм в см");
        for (int d = 1; d <= 20; d++) {
            if (d == 1) System.out.println("   " + d + " дюйм     |   " + (d * sm) + " см");
            else if (d > 1 && d < 5) System.out.println("   " + d + " дюйма    |   " + (d * sm) + " см");
            else System.out.println("   " + d + " дюймов   |   " + (d * sm) + " см");
        }
    }
}
