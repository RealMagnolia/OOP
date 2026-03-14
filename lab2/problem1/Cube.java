package lab2.problem1;

public class Cube extends Shape3D {
	private double side;

    public Cube(double s) {
        this.side = s;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return "Cube [side=" + side + ", volume=" + String.format("%.2f", volume()) + ", surfaceArea=" + String.format("%.2f", surfaceArea()) + "]";
    }
}
