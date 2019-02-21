package questionsPack.question9;

public class Main {
    public static void main(String[] args) {
        Car metalcar = new MetalCar();
        metalcar.stressTest();
        metalcar.fireTest();

        Table woodenTable = new WoodenTable();
        woodenTable.stressTest();
        woodenTable.fireTest();
    }
}
