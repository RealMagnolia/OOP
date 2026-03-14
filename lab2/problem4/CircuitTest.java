package lab2.problem4;

public class CircuitTest {
	public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);       
        Circuit g = new Parallel(c, d);     
        Circuit h = new Series(g, e);    
        Circuit circuit = new Parallel(h, f);  

        System.out.println("Total Resistance: " + circuit.getResistance() + " ohms");

        circuit.applyPotentialDiff(12.0);

        System.out.println("Potential Difference: " + circuit.getPotentialDiff() + " V");
        System.out.println("Current: " + circuit.getCurrent() + " A");
        System.out.println("Power: " + circuit.getPower() + " W");

        System.out.println();
        System.out.println("--- Component Details ---");
        System.out.println("Resistor a (3 ohm): V = " + a.getPotentialDiff() + " V, I = " + a.getCurrent() + " A");
        System.out.println("Resistor b (3 ohm): V = " + b.getPotentialDiff() + " V, I = " + b.getCurrent() + " A");
        System.out.println("Resistor c (6 ohm): V = " + c.getPotentialDiff() + " V, I = " + c.getCurrent() + " A");
        System.out.println("Resistor d (3 ohm): V = " + d.getPotentialDiff() + " V, I = " + d.getCurrent() + " A");
        System.out.println("Resistor e (2 ohm): V = " + e.getPotentialDiff() + " V, I = " + e.getCurrent() + " A");
    }
}
