
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return balance;
    }

    private void setBalance(double balance) {
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    
    // we are locking specific critical sections of the object using the keyword synchronized.
    // of the two methods that are synced only one can be accessed at a time.
    // here the unsynced methods can be accessed freely but not the synced ones.
    
    public synchronized void deposit(String name, double amt) {
        System.out.println(name + " trying to deposit " + amt);
        System.out.println(name + " getting balance");
        double bal = getBalance();
        System.out.println(name + " got balance : " + bal);
        bal += amt;
        System.out.println(name + " setting balance : " + bal);
        setBalance(bal);
    }

    public synchronized void withdraw(String name, double amt) {
        System.out.println(name + " trying to withdraw " + amt);
        System.out.println(name + " getting balance");
        
        int count = 0;
        while(amt > getBalance()) {
        	count++;
        	if(count > 2)
        		return;
        	System.out.println("Insufficient Balance");
        	try {
        		wait(3000);
        	}catch(InterruptedException e) {
        		e.printStackTrace();
        	}
        }
        double bal = getBalance();
        System.out.println(name + " got balance : " + bal);
        bal -= amt;
        System.out.println(name + " setting balance : " + bal);
        setBalance(bal);
    }
}