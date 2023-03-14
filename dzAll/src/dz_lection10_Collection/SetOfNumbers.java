package dz_lection10_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        for (int k = 0; k < numbers.size(); k++) {
            int size = numbers.size();
            for (int i = k + 1; i < size; i++) {
                    if (numbers.get(k).equals(numbers.get(i))) {
                        numbers.remove(numbers.get(i));
                        i--;
                        size = size - 1;
                    }
                }
            }
        System.out.println("\nSorted mass");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
