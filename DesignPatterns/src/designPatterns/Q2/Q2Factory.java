package designPatterns.Q2;

interface Polygon{
    void getPolygonType();
}

class Triangle implements Polygon{

    @Override
    public void getPolygonType() {
        System.out.println("Triangle");
    }
}

class Quadrilateral implements Polygon{

    @Override
    public void getPolygonType() {
        System.out.println("Quadrilateral");
    }
}

class Pentagon implements Polygon{

    @Override
    public void getPolygonType() {
        System.out.println("Pentagon");
    }
}

public class Q2Factory {
    public static void main(String[] args) {
        Polygon polygon = Q2PolygonFactory.getPolygon(3);
        polygon.getPolygonType();
        polygon = Q2PolygonFactory.getPolygon(4);
        polygon.getPolygonType();
        polygon = Q2PolygonFactory.getPolygon(5);
        polygon.getPolygonType();

    }

}
