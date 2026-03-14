package lab2.problem1;

public class Shape3DTest {
	public static void main(String [] args) {
		Shape3D shpere = new Sphere(4.0);
        Shape3D cylinder = new Cylinder(5.0, 7.0);
        Shape3D cube = new Cube(8.0);
        
        System.out.println(shpere.volume());
        System.out.println(cylinder.surfaceArea());
        System.out.println(cube.surfaceArea());
	}
}
