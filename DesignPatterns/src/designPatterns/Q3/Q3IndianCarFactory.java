package designPatterns.Q3;

public class Q3IndianCarFactory {

    static Q3Car buildCar(CarType carType) {
        Q3Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
        }

        return car;
    }
}
