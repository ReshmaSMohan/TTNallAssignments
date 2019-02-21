package questionsPack.question9;

public class MetalCar extends Car {

    public MetalCar() {
        cartype = "Metal car";
    }

    @Override
    public void stressTest() {
        System.out.println(cartype + "stresstest");

    }

    @Override
    public void fireTest() {
        System.out.println(cartype + "firetest");

    }
}

 class WoodenCar extends Car{
    public WoodenCar() {
        cartype = "Wooden car";
    }

    @Override
    public void stressTest() {
        System.out.println(cartype + "stresstest");

    }

    @Override
    public void fireTest() {
        System.out.println(cartype + "firetest");

    }
}
