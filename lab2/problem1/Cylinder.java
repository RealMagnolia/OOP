package lab2.problem1;

public class Cylinder extends Shape3D {
	private double radius, height;
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	public double getRadius() {
	    return radius;
	}

	public double getHeight() {
	    return height;
	}
	
	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	@Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height+ ", volume=" + String.format("%.2f", volume())+ ", surfaceArea=" + String.format("%.2f", surfaceArea()) + "]";
    }

}
