package Q1;

public class Account {

	private String name;
	private int balance;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public int read_balance() {
		return balance;
	}

	public boolean withdraw(int amt) {
		if (amt > balance)
			return false;
		else {
			balance -= amt;
			return true;
		}
	}

	public void deposit(int amt) {
		balance += amt;
	}

}
