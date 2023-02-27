package lection7;

//import java.util.Calendar;
//import java.util.GregorianCalendar;

public abstract class Animal {
    int animal_id;

    int getAnimal_id() {
        return animal_id;
    }

    private String name;

    public String getName() {
        return name;
    }

    /*Calendar birthday = new GregorianCalendar(2014, 1, 06);

    Calendar getBirthday() {
        return birthday;
    }*/

    public Animal(int animal_id, String name /*,Calendar birthday*/) {      //3-й параметр , Calendar birthday
        this.animal_id = animal_id;
        this.name = name;
        //this.birthday = birthday;
    }

    public abstract void display();
}
