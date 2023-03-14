package dz_lection10_Collection.Students;

public class Program {
    public static void main(String[] args) {
        StudentsMap students = new StudentsMap();
        students.addStudent("Petya", new Student("C21", 3, 6));
        students.addStudent("Valera", new Student("C21", 2, 2));
        students.addStudent("Svetlana", new Student("C21", 1, 4));
        students.addStudent("Anton", new Student("C21", 1, 3));
        students.show();
        students.removeStudent();
        students.transferToNextCourse();
    }
}
