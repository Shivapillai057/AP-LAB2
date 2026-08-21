
class  CurrentAccount  extends BankAccount {
	CurrentAccount (String num,double bal) {
		System.out.println("SavingsAccount");
		super(num,bal);
	}
	public void withdraw(double amt) {
		if (balance <= 0) {
			System.out.println("Error: Insufficient Funds. Savings cannot go below 0.");
		}
		else {
			balance -= amt;
			System.out.println("withdraw amount is "+ amt);
			System.out.println("current balance is "+ balance);

		}
	}
}