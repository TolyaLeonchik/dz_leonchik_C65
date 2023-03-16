package lection12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add(sc.nextLine());
        }
        StringBuilder result = new StringBuilder("");
        result.append(strings.get(2)).append("\n").append(strings.get(1).toUpperCase()).append("\n").append(strings.get(0).toLowerCase());
        System.out.println(result.toString());
    }
}
