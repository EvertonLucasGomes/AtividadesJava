public class Retangle {
    private double width;
    private double height;

    public Retangle() {
        width = 1;
        height = 1;
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //toString() method round to 2 decimal places
    public String toString() {
        return String.format("Retangle[width = %.1f, height = %.1f] ", width, height);
    }

}