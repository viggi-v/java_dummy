
public class AccountClient {

	public static void main(String[] args) {
		Account account = new Account(5000);
		
		TransactionThread A = new TransactionThread(account, TransactionType.CREDIT, "ROGER",2000);
		TransactionThread B = new TransactionThread(account, TransactionType.CREDIT, "  AMY",3500);
		TransactionThread C = new TransactionThread(account, TransactionType.DEBIT,  "STEVE",6000);
		
		C.start();
		
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			System.out.println(e);
		}
		A.start();
		B.start();
		
		// technically main wait for t1 to die
		// dark main
		// it has a void mind.
		
		try {
			A.join();
			B.join();
			C.join();
			
			// if main calls A.join() main waits for A to finish
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance : "+ account.getBalance());
	}

}
