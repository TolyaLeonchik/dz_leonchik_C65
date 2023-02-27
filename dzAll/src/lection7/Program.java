package lection7;

import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

public class Program {
    public static void main(String[] args) {
        //Calendar birthday = new GregorianCalendar(2014, 1, 06);
        //SimpleDateFormat stf = new SimpleDateFormat("yyyy MMM dd");
        BigDecimal weigth = new BigDecimal("21.23");

        Cat cat = new Cat(21, "Murzya", "Yellow");      //3-й параметр , birthday
        cat.display();
        Dog dog = new Dog(51, "Bobik", weigth);      ///
        dog.display();
        Tiger tiger = new Tiger(62, "Plusha", "Red", 25);    ////
        tiger.display();
    }
}
