package exception_handling;

public class SBIBank {
	private  double balance =50000;
	public double getBalance() {
		return balance;
	}
	public double withdraw(double amount)throws InsufficientBalanceException {
		if(balance >= amount) {
			balance = balance-amount;
			return amount;
		}
		else {
			throw new InsufficientBalanceException("Insufficient balance in your account!!");
		}
	}
	public String deposit(double amount) {
		balance= balance+amount;
		return "Total balance in your account "+balance;
	}
}
