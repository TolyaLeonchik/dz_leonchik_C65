import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int length = 0;
        list.add(sc.nextLine());
        int max = list.size();

        list.indexOf("b");
        list.indexOf("c");
        list.indexOf("d");
        int min = 0;
        int lengthA = list.indexOf("a");
        int lengthB = 0;
        int lengthC = 0;
        int lengthD = 0;
        for (int i = 1; i < list.size(); i++) {
            for (list.lastIndexOf("a"); lengthA < list.indexOf("a"); lengthA++){
               min++;
            }
            lengthB = list.lastIndexOf("b") - list.indexOf("b");
            lengthC = list.lastIndexOf("c") - list.indexOf("c");
            lengthD = list.lastIndexOf("d") - list.indexOf("d");
        }
        System.out.println(list.get(0));
    }
}