
public class TransactionThread extends Thread {
	private Account acc;
	private TransactionType type;
	private String name;
	private double amt;
	
	
	public TransactionThread(Account acc, TransactionType type, String name, double amt) {
		super();
		this.acc = acc;
		this.type = type;
		this.name = name;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		if(type == TransactionType.CREDIT) {
			acc.deposit(name, amt);
		}
		if(type == TransactionType.DEBIT) {
			acc.withdraw(name, amt);
		}
	}
	
}
