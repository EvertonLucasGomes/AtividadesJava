public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("blue", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.getArea();
        circle.getPerimeter();

        Retangle retangle = new Retangle();
        System.out.println(retangle);
        retangle = new Retangle(2.3, 5.8);
        System.out.println(retangle);
        retangle = new Retangle(2.5, 3.8, "orange", true);
        System.out.println(retangle);
        retangle.getArea();
        retangle.getPerimeter();

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.6);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.getArea();
        square.getPerimeter();
    }
}
