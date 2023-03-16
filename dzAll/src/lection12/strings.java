package lection12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add(sc.nextLine());
        }
        int max = 0;
        int min = 0;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(max).length() < strings.get(i).length()) {
                max = i;
            }
            if (strings.get(min).length() > strings.get(i).length()) {
                min = i;
            }
        }
        StringBuilder result = new StringBuilder("");
        result.append("Max string is '").append(strings.get(max)).append("' ");
        result.append("\n");
        result.append("Max string length is '").append(strings.get(max).length()).append("' ");
        System.out.println("Max string is '" + strings.get(max) + "'");
        System.out.println("Max string length is '" + strings.get(max).length() + "'");
    }
}
