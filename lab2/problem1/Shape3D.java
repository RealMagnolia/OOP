package lab2.problem1;

public abstract class Shape3D {
	public abstract double volume();
	
	public abstract double surfaceArea();
	
	@Override 
	public String toString() {
		return(getClass().getSimpleName() + " [Volume = " + String.format("%.2f", volume()) + ", surface area = " + String.format("%.2f", surfaceArea()) + "]");
	}
}
