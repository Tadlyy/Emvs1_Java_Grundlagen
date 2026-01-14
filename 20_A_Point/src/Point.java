public class Point {
    private final int x, y;
    private final String color;

    public Point() {
        this.x = 0;
        this.y = 0;
        this.color = "black";
    }

    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void printPoints() {
        System.out.println("x: " + this.x + ", y: " + this.y + ",");
    }

    public String getColor() {
        return this.color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
