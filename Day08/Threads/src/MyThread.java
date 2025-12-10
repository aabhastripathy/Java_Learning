
public class MyThread extends Thread {
	@Override
	public void run() {
	Thread c = Thread.currentThread();
	System.out.println("IN RUN " + c.getName() + " Priority:  " + c.getPriority());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyThread t = new MyThread();
	t.start();
	System.out.println("in main");
	}

}
