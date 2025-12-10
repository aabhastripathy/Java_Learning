
public class MyRunnable implements Runnable {
	@Override
	public void run() {
System.out.println("in run " + Thread.currentThread().getName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyRunnable r = new MyRunnable();
Thread t = new Thread(r);
t.start();
	}

}
