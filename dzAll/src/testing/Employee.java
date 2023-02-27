package testing;

class Employee extends Person {
    String bank;
    String getBank(){
        return bank;
    }
    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display() {
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
