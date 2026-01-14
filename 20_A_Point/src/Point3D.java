public class Point3D extends Point {

    private final int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z, String color) {
        super(x, y, color);
        this.z = z;
    }

    @Override
    public void printPoints() {
        System.out.println("x: " + getX() + ", y: " + getY() + ", z: " + this.z + ",");
    }

    public int getZ() {
        return this.z;
    }

}
