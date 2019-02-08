package lecture02_oop_ii.class_examples;

public class BankAccount {
	private double amount;

	public BankAccount() {
		this.amount = 0.0;
	}

	public BankAccount(double amount) {
		this.setAmount(amount);
		//this.amount = amount;
	}

	//read-only
	public double getAmount() {
		return this.amount;
	}

	//write-only
	public void setAmount(double amount) {
		if(amount < 0) {
			System.out.println("ERROR: New amount cannot be negative.");
			System.out.println("Value set to 0");
			this.amount = 0;
		}
		else {
			this.amount = amount;
		}
	}








}
