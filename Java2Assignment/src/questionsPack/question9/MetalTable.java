package questionsPack.question9;

public class MetalTable extends Table{

    public MetalTable() {
        tabletype="Metal table";
    }

    @Override
    public void stressTest() {
        System.out.println(tabletype + "table stresstest");

    }

    @Override
    public void fireTest() {
        System.out.println(tabletype + "table firetest");
    }


}

class WoodenTable extends Table{

    public WoodenTable() {
        tabletype="Wooden table";
    }

    @Override
    public void stressTest() {
        System.out.println(tabletype + "table stresstest");

    }

    @Override
    public void fireTest() {
        System.out.println(tabletype + "table firetest");
    }


}
