package testing;

public class NonEmp extends Employee{
    String job;
    @Override
    String getName() {
        return super.getName();
    }

    public NonEmp(String name, String company, String name_job) {
        super(name, company);
        this.job = name_job;
    }

    @Override
    public void display() {
        System.out.printf("NonEmployee Name: %s \t Bank: %s \t Name job: %s\n", super.getName(), super.getBank(), job);
    }
}
