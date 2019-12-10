package Q8;

public class Account {

	public int balance = 0;

	public Account(int i) {
		balance = i;
	}

	public void deposit(int amt) {
		this.balance += amt;
	}

	public void withdraw(int amt) throws Insuffunds, MaxWithdrawExceeded {
		int resultCode = 0;
		if (amt > 100) {
			throw new MaxWithdrawExceeded();
		} else if (amt > balance) {
			throw new Insuffunds();
		} else {
			balance -= amt;
		}
	}

	public int read_balance() {
		return this.balance;
	}

}
