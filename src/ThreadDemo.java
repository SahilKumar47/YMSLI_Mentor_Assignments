
class MyJob implements Runnable {
	
	@Override
	public void run() {
		System.out.println("job done by thread... " + Thread.currentThread().getName());
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Hello to java.....");
		MyJob job = new MyJob();
		Thread thread = new Thread(job, "foo");
		thread.start();
	}
}
