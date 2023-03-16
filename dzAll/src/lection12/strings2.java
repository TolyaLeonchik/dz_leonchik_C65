package lection12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        int arg = 0;
        for (int i = 0; i < 4; i++) {
            strings.add(sc.nextLine());
            arg = arg + strings.get(i).length();
        }
        arg = arg / strings.size();
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
        result.append("Max string length is '").append(strings.get(max).length()).append("'\n");
        result.append("Min string length is '").append(strings.get(min).length()).append("'\n");

        result.append("Strings, which are longer than arg length string:\n");
        for (String string : strings) {
            if (string.length() > arg) {
                result.append(string).append("\n");
            }
        }
        System.out.println(result.toString());
    }
}
