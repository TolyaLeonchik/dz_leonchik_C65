package lection7;

//import java.util.Calendar;

public class Cat extends Animal {
    private String eyesColor;

    public String getEyesColor() {
        return eyesColor;
    }

    public Cat(int cat_id, String cat_name, /*Calendar cat_birthday,*/ String cat_eyesColor) {
        super(cat_id, cat_name /*cat_birthday*/);
        this.eyesColor = cat_eyesColor;
    }

    @Override
    public void display() {
        System.out.printf("ID: %d\t Name: %s\t Eyes color: %s\n", super.animal_id, super.getName(),
                /*super.birthday,*/ getEyesColor());
    }
}
