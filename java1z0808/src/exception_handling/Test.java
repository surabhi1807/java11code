package exception_handling;

public class Test {

	public static void main(String[] args) {
    SBIBank card =new  SBIBank();
    System.out.println("before deposit balance="+card.getBalance());
    String deposit = card.deposit(10000);
    System.out.println(deposit);
    System.out.println("after deposit balance ="+card.getBalance());
    try {
		System.out.println(card.withdraw(70000));
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
		System.out.println(e.getMessage());
	}
    System.out.println("after withdraw balance ="+card.getBalance());
	}

}
