package labAssessment;

public class BankAccount {
	private String accountHolderName;
	private String bankName;
	private double accountBalance;
	//constructor
	public BankAccount(String accountHolderName, String bankName, double initialBalance)
	{
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountBalance = initialBalance;
	}
	//method for interface - getBalance(), deposit(), and withdraw()
	public double getBalance()
	{
		return accountBalance;
	}
	
	public void deposit (double amount)
	{
		if (amount > 0)
		{
			accountBalance += amount;
			System.out.println("Deposited : " + amount);
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdrawn(double amount)
	{
		if (amount > 0 && accountBalance >= amount)
		{
			accountBalance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
	//Implement all three methods.
	public void displayAccountInfo()
	{
		System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Bank Name: "+ bankName);
		System.out.println("Account Balance: "+ accountBalance);
		}
	
	public static void main(String[] args) {
		//Create three bank accounts
		BankAccount account1 = new BankAccount("Nikhil", "ICIC", 1000);
		BankAccount account2 = new BankAccount("Sumithra", "HDFC", 700);
		BankAccount account3 = new BankAccount("KAntharaju", "SBI", 2000.0);
		
		//Deposit and withdraw money for each account
		account1.deposit(5000);
		account1.withdrawn(2000);
		account1.displayAccountInfo();
		
		account2.deposit(100);
		account2.withdrawn(20);
		account2.displayAccountInfo();
		
		account3.deposit(2000);
		account3.withdrawn(400);
		account3.displayAccountInfo();
	}

}
