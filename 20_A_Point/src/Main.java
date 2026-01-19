public class Main {

    public static void main(String[] args) {
        // Object
        Object obj = new Object();

        // Point
        Point p_default = new Point();
        Point p_unique = new Point(5, 10, "yellow");

        System.out.println(p_default.getColor());
        System.out.println(p_unique.getColor());
        p_default.printPoints();
        p_unique.printPoints();

        // Point3D
        Point3D p3D_default = new Point3D();
        Point3D p3D_unique = new Point3D(10, 5, 100, "orange");

        System.out.println(p3D_default.getColor());
        System.out.println(p3D_unique.getColor());
        p3D_default.printPoints();
        p3D_unique.printPoints();

        System.out.println(p_default);





    }
}