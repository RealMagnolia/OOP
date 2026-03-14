package lab2.problem4;

public class Series extends Circuit {
	private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.potentialDifference = 0.0;
    }

    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        double totalResistance = getResistance();
        double I = V / totalResistance;
        c1.applyPotentialDiff(I * c1.getResistance());
        c2.applyPotentialDiff(I * c2.getResistance());
    }
}
