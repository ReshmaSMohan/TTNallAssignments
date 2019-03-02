package designPatterns.Q3;

public class Q3USACarFactory {
    static Q3Car buildCar(CarType carType) {
        Q3Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}
