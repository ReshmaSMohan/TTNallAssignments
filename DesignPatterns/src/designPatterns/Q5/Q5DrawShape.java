package designPatterns.Q5;

public class Q5DrawShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5, new BlueColor());
        System.out.println(circle);
        circle = new Circle(15, new RedColor());
        System.out.println(circle);

        Square square = new Square(10, new PinkColor());
        System.out.println(square);

        Rectangle rectangle = new Rectangle(10, 20, new RedColor());
        System.out.println(rectangle);
    }

}
