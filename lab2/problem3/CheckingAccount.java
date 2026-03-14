package lab2.problem3;

public class CheckingAccount extends Account {
	private int transactionCount;
    public static final int FREE_TRANSACTIONS = 3;
    public static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNum) {
        super(accNum);
        transactionCount = 0;
    }

    public void deposit(double sum) {
        super.deposit(sum);
        if (sum > 0) {
            transactionCount++;
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && balance >= sum) {
            super.withdraw(sum);
            transactionCount++;
        }
    }

    public void deductFee() {
        int excess = transactionCount - FREE_TRANSACTIONS;
        if (excess > 0) {
            balance -= excess * TRANSACTION_FEE;
        }
        transactionCount = 0;
    }

    public String toString() {
        return "Checking " + super.toString() + ", Transactions: " + transactionCount;
    }
}
