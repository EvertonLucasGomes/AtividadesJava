public class TestMain {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.evaluate(10));
        System.out.println(p2.evaluate(10));

        System.out.println(p1.getDegree());
        System.out.println(p2.getDegree());
    }
}
