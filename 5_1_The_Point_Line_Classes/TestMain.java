public class TestMain {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println(p1);
        System.out.println(p2);

        Line line = new Line(p1, p2);
        System.out.println(line);
        System.out.println(line.getLength());
        System.out.println(line.getBegin().getX());

    }
}
