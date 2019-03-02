package designPatterns.Q3;

enum CarType {
    MICRO, MINI, LUXURY;
}

enum Location {
    USA, INDIA, JAPAN;
}

abstract class Q3Car {

    CarType carType;

    Location location;

    public Q3Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class LuxuryCar extends Q3Car {

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("connecting to Luxury Car");
    }
}

class MiniCar extends Q3Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("connecting to Mini Car");
    }
}

class MicroCar extends Q3Car {

    public MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("connecting to Micro Car");
    }
}
