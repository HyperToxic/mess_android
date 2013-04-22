package guohao.test.thread;


class PriorityTest
{
	public static void main(String[] args)
	{
		MyThread4 m2 = new MyThread4();
		MyThread5 m3 = new MyThread5();
	   m2.setPriority(Thread.NORM_PRIORITY + 5);
		m2.start();
		m3.start();
	}
}

class MyThread4 extends Thread
{
	public void run()
	{
		for(int i = 0;i<100;i++)
		{
			/*if(i%10 == 0)
			{
				yield();
			}
			*/
			System.out.println(i + "A");
		}
	}
}

class MyThread5 extends Thread
{
	public void run()
	{
		for(int i = 0;i<100;i++)
		{
			/*if(i%10 == 0)
			{
				yield();
			}
			*/
			System.out.println(i + "B------------");
		}
	}
}