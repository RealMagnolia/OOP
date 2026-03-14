package lab2.problem1;
import java.util.HashSet;

public class VehicleTest {
	public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", 2020);
        Vehicle v2 = new Vehicle("Toyota", 2020);  
        Vehicle v3 = new Vehicle("Honda", 2019);

        Car c1 = new Car("Ford", 2021, 4);
        Car c2 = new Car("Ford", 2021, 4);  
        Car c3 = new Car("Ford", 2021, 2); 

        System.out.println("v1.equals(v2): " + v1.equals(v2));
        System.out.println("v1.equals(v3): " + v1.equals(v3));  
        System.out.println("c1.equals(c2): " + c1.equals(c2)); 
        System.out.println("c1.equals(c3): " + c1.equals(c3)); 

        System.out.println("\nv1.hashCode() == v2.hashCode(): " + (v1.hashCode() == v2.hashCode())); 
        System.out.println("c1.hashCode() == c2.hashCode(): " + (c1.hashCode() == c2.hashCode()));  

        HashSet<Vehicle> set = new HashSet<>();
        set.add(v1);
        set.add(v2); 
        set.add(v3);
        set.add(c1);
        set.add(c2);  
        set.add(c3);

        System.out.println("\nAdded 6 objects (2 duplicates) to HashSet.");
        System.out.println("HashSet size: " + set.size());  

        System.out.println("\nContents of the HashSet:");
        for (Vehicle v : set) {
            System.out.println("  " + v);
        }
    }
}
