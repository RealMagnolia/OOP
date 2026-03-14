package lab2.problem3;

public class SavingsAccount extends Account {
	private double interestRate;

    public SavingsAccount(int accNum, double interestRate) {
        super(accNum);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }

    public String toString() {
        return "Savings " + super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}
