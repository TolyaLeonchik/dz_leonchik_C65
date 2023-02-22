package lection6;

public class Student {
    String name;
    int group;
    int mark;

    void displayInfo() {
        if (mark >= 9) {
            System.out.printf("Имя студента: %s\nГруппа: %d\tОценка: %d\n", name, group, mark);
        }
    }
}
