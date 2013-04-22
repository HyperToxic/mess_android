package guohao.test.thread;

class ThreadTest {
	public static void main(String[] args) {
		Runner r = new Runner();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("MAIN" + i);
		}
	}
}

class Runner implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("RUNNER" + i);
		}
	}
}