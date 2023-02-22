package lection6;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Student[] mas = new Student[random.nextInt(3, 6)];

        for (int i = 0; i < mas.length; i++) {
            Student unit = new Student();
            unit.group = 65;
            unit.name = sc.nextLine();
            unit.mark = random.nextInt(11);
            mas[i] = unit;
            System.out.println(mas[i]);
            //System.out.printf("Имя студента: %s\nГруппа: %d\tОценка: %d\n",unit.name,unit.group,unit.mark);     //вывод инф.всех студентов
            unit.displayInfo();    //вывод инф.об отличниках через метод класса
        }
    }
}
