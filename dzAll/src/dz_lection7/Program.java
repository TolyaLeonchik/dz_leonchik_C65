package dz_lection7;

public class Program {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar(333, 250, 2840, "BMW X6", 4, 4.4,
                "Внедорожник", 4);
        car.display();
        car.kVt();
        car.displayFuelPath();
        System.out.println();

        FreightCar truck = new FreightCar(136, 126, 4200, "Iveco", 4,
                3.0, 2.1);
        truck.display();
        truck.kVt();
        truck.checkLoadCapacity();
        System.out.println();

        CivilAirTransport civilAirplane = new CivilAirTransport(1125, 876, 36400, "Boeing 737",
                35.7, 3300, 123, false);
        civilAirplane.display();
        civilAirplane.kVt();
        civilAirplane.checkLoadPlaces();
        System.out.println();

        MilitaryAirTransport militaryAirplane = new MilitaryAirTransport(2310, 2410, 11000, "МиГ -35",
                12, 1300, true, 4);
        militaryAirplane.display();
        militaryAirplane.kVt();
        militaryAirplane.checkNumberRockets();
        militaryAirplane.catapult();
    }
}
