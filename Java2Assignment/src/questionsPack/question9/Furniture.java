package questionsPack.question9;

public interface Furniture {
    void stressTest();
    void fireTest();
}

abstract class Car implements Furniture{

    String cartype;
}

abstract class Table implements Furniture{
    String tabletype;
}
