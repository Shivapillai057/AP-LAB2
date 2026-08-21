class  SavingsAccount extends BankAccount {
	SavingsAccount(String num, double bal) {
		super(num,bal);
		System.out.println("SavingsAccount");

	}
	public void withdraw(double amt) {
		if (balance <= 0) {
			System.out.println("Error: Insufficient Funds. Savings cannot go below 0.");
		}
		else {
			balance -= amt;
			System.out.println("withdraw amount is "+ amt);


		}
	}
}