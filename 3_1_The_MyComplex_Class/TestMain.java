public class TestMain {
    public static void main(String[] args) {
        MoreCompleteMyComplex c1 = new MoreCompleteMyComplex(3, 4);
        MoreCompleteMyComplex c2 = new MoreCompleteMyComplex(5, 6);
        MoreCompleteMyComplex c3 = new MoreCompleteMyComplex(3, 0);
        MoreCompleteMyComplex c4 = new MoreCompleteMyComplex(3, 0);

        System.out.println("c1 is " + c1);
        System.out.println("c2 is " + c2);

        System.out.println("c1 is " + (c1.isReal() ? "" : "not ") + "real");
        System.out.println("c1 is " + (c1.isImaginary() ? "" : "not ") + "imaginary");
        System.out.println("c3 is " + (c3.isReal() ? "" : "not ") + "real");

        System.out.println("c1 is " + (c1.equals(c2) ? "" : "not ") + "equal to c2");
        System.out.println("c3 is " + (c3.equals(c4) ? "" : "not ") + "equal to c4");

        System.out.println("c1 magnitude is " + c1.magnitude());

        System.out.println("c1 argument is " + c1.argument());

        System.out.println("c1 + c2 is " + c1.add(c2));

        System.out.println("c1 - c2 is " + c1.subtract(c2));

        System.out.println("c1 + c2 is " + c1.addNew(c2));

        System.out.println("c1 - c2 is " + c1.subtractNew(c2));

        System.out.println("c1 * c2 is " + c1.multiply(c2));

        System.out.println("c1 / c2 is " + c1.divide(c2));

        System.out.println("c1 conjugate is " + c1.conjugate());

    }
}
