package joinDemo1;

public class JoinMoreTest2 {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		System.out.println("                    main end "
				+ System.currentTimeMillis());
	}
	static public class ThreadA extends Thread {
		private ThreadB b;

		public ThreadA(ThreadB b) {
			super();
			this.b = b;
		}

		@Override
		public void run() {
			try {
				synchronized (b) {
					System.out.println("begin A ThreadName="
							+ Thread.currentThread().getName() + "  "
							+ System.currentTimeMillis());
					Thread.sleep(5000);
					System.out.println("  end A ThreadName="
							+ Thread.currentThread().getName() + "  "
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	static public class ThreadB extends Thread {
		@Override
		synchronized public void run() {
			try {
				System.out.println("begin B ThreadName="
						+ Thread.currentThread().getName() + "  "
						+ System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("  end B ThreadName="
						+ Thread.currentThread().getName() + "  "
						+ System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}