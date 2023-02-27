package lection7;

//import java.util.Calendar;

public class Tiger extends Cat {
    private int countEatenEmployees;

    public Tiger(int tiger_id, String tiger_name, /*Calendar tiger_birthday,*/
                 String tiger_eyeColor, int countEatenEmployees) {
        super(tiger_id, tiger_name, /*tiger_birthday,*/ tiger_eyeColor);
        this.countEatenEmployees = countEatenEmployees;
    }

    @Override
    public void display() {
        System.out.printf("ID: %d\t Name: %s\t Eyes color: %s\t Was eaten employees: %d\n", super.getAnimal_id(), super.getName(),       //	 Birthday: %d
                /*super.birthday,*/ super.getEyesColor(), countEatenEmployees);
    }
}
