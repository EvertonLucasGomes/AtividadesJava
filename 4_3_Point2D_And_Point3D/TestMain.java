public class TestMain {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(1, 2);
        System.out.println(p2d);
        Point3D p3d = new Point3D(3, 4, 5);
        System.out.println(p3d);
        p3d.setZ(6);
        System.out.println(p3d);
        System.out.println(p3d.getXY()[0]);
        System.out.println(p3d.getXY()[1]);
        System.out.println(p3d.getXYZ()[0]);
        System.out.println(p3d.getXYZ()[1]);
        System.out.println(p3d.getXYZ()[2]);
    }
}
