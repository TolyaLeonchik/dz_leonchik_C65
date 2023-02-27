package testing;

public class Program {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();
        NonEmp petya = new NonEmp("Petya", "Leiws", "Engineer");
        petya.display();
    }
}
