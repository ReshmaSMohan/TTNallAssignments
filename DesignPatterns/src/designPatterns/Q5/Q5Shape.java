package designPatterns.Q5;

public abstract class Q5Shape {

    Q5Color color;
}

class Circle extends Q5Shape {
    private Integer radius;

    public Circle(Integer radius, Q5Color color) {
        this.radius = radius;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                color.getColor()+
                '}';
    }
}

class Square extends Q5Shape{
    private Integer side;

    public Square(Integer side, Q5Color color) {
        this.side=side;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                color.getColor()+
                '}';
    }
}

class Rectangle extends Q5Shape{
    private Integer length;
    private Integer breadth;

    public Rectangle(Integer length, Integer breadth, Q5Color color) {
        this.length = length;
        this.breadth = breadth;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                color.getColor()+
                '}';
    }
}
