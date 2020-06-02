package entities;

public class Account {

	private int number;
	private String owner;
	private double balance;
	
	public Account(int number, String owner) {
		this.number = number;
		this.owner = owner;
	}

	public Account(int number, String owner, double initialDeposit) {
		this.number = number;
		this.owner = owner;
		deposit(initialDeposit);
	}
	
	public void deposit(double quantity) {
		balance += quantity;
	}
	
	public void withdrawal(double quantity){
		balance -= (quantity + 5);
	}
		
	public int getNumber() {
		return number;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Number: " + number
			+ ", Owner: " + owner
			+ ", Balance R$" + String.format("%.2f", balance);
	}
	
}