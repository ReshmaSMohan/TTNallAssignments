package designPatterns.Q2;

import designPatterns.Q2.Pentagon;
import designPatterns.Q2.Polygon;
import designPatterns.Q2.Quadrilateral;
import designPatterns.Q2.Triangle;

public class Q2PolygonFactory {

    static Polygon getPolygon(Integer sides) {

        Polygon polygon = null;
        switch (sides) {

            case 3:
                polygon = new Triangle();
                break;
            case 4:
                polygon = new Quadrilateral();
                break;
            case 5:
                polygon = new Pentagon();
                break;
        }
        return polygon;
    }
}
