package guohao.test.thread;


class DeadLockTest implements Runnable
{
	public static Object  o1 = new Object();
	public static Object  o2 = new Object();
	
	public int flag = 0;
	
	public void run()
	{
		System.out.println("flag=" + flag);
		
		if(flag==1)
		{
			synchronized(o1)
			{
			
				try
					{
					//synchronized(o2);
					Thread.sleep(1000);
					}
				catch(Exception e){}
			}
			synchronized(o2)
			{
				System.out.println("im g1 method");
			}
			
		}

		//synchronized(o2);
		if(flag==2)
		{
			
			synchronized(o2)
			{
				try
				{
					Thread.sleep(1000);
				}
					catch(Exception e){}
			}
			synchronized(o1)
			{
				System.out.println("im g2 method");
			}
			
		}
	}

	public static void main(String[] args)
	{
		DeadLockTest d1 = new DeadLockTest();
		DeadLockTest d2 = new DeadLockTest();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		d1.flag=1;
		d2.flag=2;
		t1.start();
		t2.start();
		
	}
}