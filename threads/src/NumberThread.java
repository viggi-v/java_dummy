
public class NumberThread extends Thread {
	private int start;
	private int end;
	
	public NumberThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	private void print() {
		Thread t = Thread.currentThread();
		for(int i = start; i < end; i++) {
			System.out.println(t.getName() + ":" + i);
		}
	}
	@Override
	public void run() {
		print();
	}
}
