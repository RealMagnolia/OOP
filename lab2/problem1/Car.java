package lab2.problem1;
import java.util.Objects;

public class Car extends Vehicle {
	private int numDoors;

    public Car(String make, int year, int numDoors) {
        super(make, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public String toString() {
        return "Car{make='" + getMake() + "', year=" + getYear() + ", numDoors=" + numDoors + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numDoors == car.numDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numDoors);
    }
}
