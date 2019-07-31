
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		NumberThread t1 = new NumberThread(1,400);
		NumberThread t2 = new NumberThread(600,800);
		t1.start();
		t2.start();
		doTask();
		System.out.println("RIP Main :(");
	}
	public static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name:"+t.getName());
		System.out.println("Group:"+t.getThreadGroup().getName());
		System.out.println("Priority:"+t.getPriority());
		System.out.println("Daemon:"+t.isDaemon());
	}
}
