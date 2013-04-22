package guohao.test.thread;

class SyncTest implements Runnable

{
	Test test = new Test();

	public static void main(String[] args) {
		SyncTest s = new SyncTest();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.start();
		t2.start();
	}

	public void run() {
		test.t();
	}
}

class Test {
	private int num;

	public synchronized void t()// 锁定执行该方法当前对象；
	{
		num++;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("使用者的序号是：  " + num);
	}
}
