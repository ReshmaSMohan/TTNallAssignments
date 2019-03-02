package designPatterns.Q3;

public class Q3CarFactory {
    Q3Car car = null;

    static Q3Car buildCar(CarType carType, Location location) {
        Q3Car car = null;
        switch (location) {
            case INDIA:
                car = Q3IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = Q3USACarFactory.buildCar(carType);
                break;
            case JAPAN:
                car = Q3JapanCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
