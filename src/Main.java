public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Stels");
        Car car = new Car("Lada",4);
        Truck truck = new Truck("Kamaz",6);

        ServiceStation serviceStation = new ServiceStation();


        System.out.println("Диагностика велосипеда");
        serviceStation.check(bicycle);
        System.out.println("-------------------------------------");

        System.out.println("Диагностика легкового авто ");
        serviceStation.check(car);
        System.out.println("-------------------------------------");

        System.out.println("Диагностика грузового транспорта");
        serviceStation.check(truck);
        System.out.println("-------------------------------------");
    }
}