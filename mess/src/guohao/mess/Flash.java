package guohao.mess;

public class Flash extends Thread {

	public void run() {
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i--) {
			System.out.println("Flash");
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
