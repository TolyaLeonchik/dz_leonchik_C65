package testing;

abstract class Person {
    String name;
    String getName() {
        return name;
    }
    public Person(String name) {
        this.name = name;
    }
    public abstract void display();
}
