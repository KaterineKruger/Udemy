package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Guilherme", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Julia", 0.0, 500.0);
		
		// Upcasting
		
		Account acc01 = bacc;
		Account acc02 = new BusinessAccount(1003, "Katerine", 0.0, 200.0);
		Account acc03 = new SavingAccount(1004, "Samantha", 0.0, 0.01);
		
		// Downcasting
		
		BusinessAccount acc04 = (BusinessAccount)acc02;
		acc04.loan(100.0);
		
		// BusinessAccount acc05 = (BusinessAccount)acc03;
		if(acc03 instanceof BusinessAccount) {
			BusinessAccount acc05 = (BusinessAccount)acc03;
			acc05.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc03 instanceof SavingAccount) {
			SavingAccount acc05 = (SavingAccount)acc03;
			acc05.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc06 = new Account(1005, "Pitty", 1000.00);
		acc06.withdraw(200.00);
		System.out.println(acc06.getBalance());
		
		Account acc07 = new SavingAccount(1006, "Cintia", 1000.0, 0.01);
		acc07.withdraw(200.00);
		System.out.println(acc07.getBalance());
		
		Account acc08 = new BusinessAccount(1007, "Bob", 1000.00, 500.00);
		acc08.withdraw(200.0);
		System.out.println(acc08.getBalance());
	}

}