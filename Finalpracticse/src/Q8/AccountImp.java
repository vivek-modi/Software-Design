package Q8;

public class AccountImp {

	public static void main(String args[]) {
		Account a = new Account(150);
		int amt[] = { 70, 120, 85 };
		for (int i = 0; i < 3; i++) {

			try {
				a.withdraw(amt[i]);
				System.out.println("Success");
			} catch (Insuffunds e) {
				System.out.println("Insuff Funds");
			} catch (MaxWithdrawExceeded e) {
				System.out.println("Max withdrawl is 100");
			}
		}

	}

}
