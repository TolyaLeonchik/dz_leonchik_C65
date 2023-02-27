package lection7;

import java.math.BigDecimal;
//import java.util.Calendar;

public class Dog extends Animal {
    private BigDecimal weigth;

    public Dog(int dog_id, String dog_name, /*Calendar dog_birthday,*/ BigDecimal weigth) {
        super(dog_id, dog_name /*dog_birthday*/);
        this.weigth = weigth;
    }

    @Override
    public void display() {
        System.out.printf("ID: %d\t Name: %s\t Weight %s kg.\n", super.getAnimal_id(), super.getName(),       //	 Birthday: %d
                /*super.birthday,*/ weigth);
    }
}
