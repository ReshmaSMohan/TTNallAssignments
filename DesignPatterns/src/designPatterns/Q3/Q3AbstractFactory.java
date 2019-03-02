package designPatterns.Q3;

public class Q3AbstractFactory {
    public static void main(String[] args) {
        System.out.println(Q3CarFactory.buildCar(CarType.MICRO, Location.USA));
        System.out.println(Q3CarFactory.buildCar(CarType.MINI, Location.JAPAN));
        System.out.println(Q3CarFactory.buildCar(CarType.LUXURY, Location.INDIA));


    }
}
