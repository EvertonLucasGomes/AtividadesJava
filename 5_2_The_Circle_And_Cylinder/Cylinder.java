public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this.base = new Circle(radius);
        this.height = 1.0;
    }

    public Cylinder(Circle circle, double height) {
        this.base = circle;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.base.getArea() * this.height;
    }

    public Circle getBase() {
        return this.base;
    }

    public String toString() {
        return "Cylinder[base=" + this.base + ",height=" + this.height + "]";
    }

}