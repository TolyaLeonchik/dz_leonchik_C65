package dz_lection10_Collection.Students;

import java.util.HashMap;
import java.util.Map;

public class StudentsMap {
    private final HashMap<String, Student> students;

    public StudentsMap() {
        this.students = new HashMap<>();
    }

    public void addStudent(String name, Student student) {
        this.students.put(name, student);
    }

    public Map<String, Student> removeStudent() {
        for (Map.Entry<String, Student> entry : this.students.entrySet()) {
            if (entry.getValue().getMarks() >= 3) {
                this.students.put(entry.getKey(), entry.getValue());
                System.out.printf("Name: %s \t Group: %s Course: %d Mark: %d\n", entry.getKey(), entry.getValue().getGroup(),
                        entry.getValue().getCourse(), entry.getValue().getMarks());
            } else {
                this.students.remove(entry.getKey(), entry.getValue());
            }
        }
        System.out.println();
        return this.students;
    }
    public Map<String, Integer> transferToNextCourse() {
        HashMap<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Student> entry : this.students.entrySet()) {
            if (entry.getValue().getMarks() >= 3) {
                result.put(entry.getKey(), entry.getValue().getCourse());
                result.replace(entry.getKey(), entry.getValue().getCourse(), entry.getValue().getCourse() + 1);
            } else {
                result.put(entry.getKey(), entry.getValue().getCourse());
                System.out.printf("Студенты, которые НЕ переводятся на следующий курс:\n" +
                        "Name: %s \t Course: %d\n", entry.getKey(), entry.getValue().getCourse());
                result.remove(entry.getKey());
            }
        }
        System.out.println("Студент, которые переведены на следующий курс:");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
                System.out.printf("Name: %s \t Course: %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println();
        return result;
    }

    public void show() {
        for (Map.Entry<String, Student> entry : this.students.entrySet()) {
            System.out.printf("Name: %s \t Group: %s Course: %d Mark: %d\n", entry.getKey(), entry.getValue().getGroup(),
                    entry.getValue().getCourse(), entry.getValue().getMarks());
        }
        System.out.println();
    }
}
