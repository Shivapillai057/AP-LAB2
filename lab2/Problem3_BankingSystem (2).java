/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Problem3_BankingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Select Account Type (1-Savings, 2-Current): ");
		int choice = sc.nextInt();
		System.out.print("Enter Acc No and Initial Balance: ");
		String num = sc.next();
		double bal = sc.nextDouble();

		BankAccount account = (choice == 1) ? new SavingsAccount(num, bal) : new
		                      CurrentAccount(num, bal);
		System.out.print("Enter withdrawal amount: ");
		double amt = sc.nextDouble();
		account.withdraw(amt);
		System.out.println("Remaining Balance: " + account.getBalance());
		sc.close();
	}
}