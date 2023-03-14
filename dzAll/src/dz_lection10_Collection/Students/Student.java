package dz_lection10_Collection.Students;

public class Student {
    private final String group;
    private final int course;
    private final int marks;

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    public Student(String group, int course, int marks) {
        this.course = course;
        this.group = group;
        this.marks = marks;
    }
}
