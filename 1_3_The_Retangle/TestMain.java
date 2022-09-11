public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
         Retangle r1 = new Retangle(1.2f, 3.4f);
         System.out.println(r1); // toString()
         Retangle r2 = new Retangle(); // default constructor
         System.out.println(r2);
        // Test setters and getters
         r1.setHeight(5.6f);
         r1.setWidth(7.8f);
         System.out.println(r1); // toString()
         System.out.println(String.format("length is: %2f", r1.getHeight()));
         System.out.println(String.format("width is: %2f", r1.getWidth()));
        // Test getArea() and getPerimeter()
         System.out.printf("area is: %.2f%n", r1.getArea());
         System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
         }
}
