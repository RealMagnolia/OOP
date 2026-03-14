package lab2.problem3;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(1001, 5.0);
        CheckingAccount ca = new CheckingAccount(1002);
        Account a = new Account(1003);

        bank.addAccount(sa);
        bank.addAccount(ca);
        bank.addAccount(a);

        sa.deposit(1000.0);
        ca.deposit(500.0);
        a.deposit(300.0);

        System.out.println("After deposits:");
        System.out.println(bank);

        sa.withdraw(200.0);
        ca.withdraw(100.0);
        ca.deposit(50.0);
        ca.withdraw(25.0);
        ca.deposit(10.0);  

        a.transfer(100.0, sa);

        System.out.println("After transactions:");
        System.out.println(bank);

        bank.update();

        System.out.println("After bank update (interest/fees applied):");
        System.out.println(bank);

        System.out.println("Individual account prints:");
        sa.print();
        ca.print();
        a.print();

        bank.closeAccount(1003);
        System.out.println("\nAfter closing account 1003:");
        System.out.println(bank);
	}

}
