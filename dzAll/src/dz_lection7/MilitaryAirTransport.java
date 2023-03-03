package dz_lection7;

public class MilitaryAirTransport extends AirTransport {
    boolean catapultSystem;
    int rocketsNumber;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minLength,
                                boolean catapultSystem, int rocketsNumber) {
        super(power, maxSpeed, weight, model, wingspan, minLength);
        this.catapultSystem = catapultSystem;
        this.rocketsNumber = rocketsNumber;
    }

    @Override
    public void display() {
        System.out.printf("Военный самолет марки: %s \t Наличие системы катапультирования: %b \t Кол-во ракет на борту: %d \t" +
                        " Размах крыльев: %.1f \t Мощность: %d л.с.\nМакс. скорость: %d км/ч\t " +
                        "Мин. длина взлётно-посадочной полосы для взлёта: %d м\tМасса: %d кг\n",
                super.getModel(), catapultSystem, rocketsNumber, super.getWingspan(),
                super.getPower(), super.getMaxSpeed(), super.getMinLength(), super.getWeight());
    }

    public void checkNumberRockets() {
        if (rocketsNumber > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (catapultSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
