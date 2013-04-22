package guohao.test.thread;

class YieldTest {
	public static void main(String[] args) {
		MyThread2 m2 = new MyThread2();
		MyThread3 m3 = new MyThread3();
		m2.start();
		m3.start();
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				yield();
			}
			System.out.println(i + "A");
		}
	}
}

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				yield();
			}
			System.out.println(i + "B------------");
		}
	}
}