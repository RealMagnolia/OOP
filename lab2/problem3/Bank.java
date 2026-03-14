package lab2.problem3;
import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                return;
            }
        }
    }

    public void update() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest();
            } else if (a instanceof CheckingAccount) {
                ((CheckingAccount) a).deductFee();
            }
        }
    }

    public String toString() {
        String result = "Bank Accounts:\n";
        for (int i = 0; i < accounts.size(); i++) {
            result += "  " + accounts.get(i).toString() + "\n";
        }
        return result;
    }
}
