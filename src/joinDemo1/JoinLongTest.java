package joinDemo1;

public class JoinLongTest {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();

			threadTest.join(2000);// 只等2秒
			//Thread.sleep(2000);

			System.out.println("  end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static public class MyThread extends Thread {

		@Override
		public void run() {
			try {
				System.out.println("begin Timer=" + System.currentTimeMillis());
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
