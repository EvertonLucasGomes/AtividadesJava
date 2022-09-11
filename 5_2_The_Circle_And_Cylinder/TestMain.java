public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println(c1); // Circle[radius=2.0,color=blue]

        Cylinder cy1 = new Cylinder(c1, 2.0);
        System.out.println(cy1);
        System.out.println("height is " + cy1.getHeight());
        System.out.println("base is " + cy1.getBase());
        System.out.println("base area is " + cy1.getBase().getArea());
        System.out.println("color is " + cy1.getBase().getColor());
        System.out.println("volume is " + cy1.getVolume());
    }
}
