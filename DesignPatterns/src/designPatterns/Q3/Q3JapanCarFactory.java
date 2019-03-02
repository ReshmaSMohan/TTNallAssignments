package designPatterns.Q3;

public class Q3JapanCarFactory {
    static Q3Car buildCar(CarType carType) {
        Q3Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.JAPAN);
                break;
            case MINI:
                car = new MiniCar(Location.JAPAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.JAPAN);
                break;
        }
        return car;
    }
}
