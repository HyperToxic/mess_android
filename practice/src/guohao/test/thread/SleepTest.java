package guohao.test.thread;
import java.util.*;
class SleepTest
{
	public static void main(String[] args)
	{
		MyThread thread = new MyThread();
		thread.start();
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("´ò¶Ï");
			
		}
		//thread.flag=false;
		thread.interrupt();
		
		
		
		
	}
	
}

class MyThread extends Thread
{
	boolean flag = true;
	public void run()
	{
			//boolean flag = true;
			while(flag){
				System.out.println("----" + new Date() + "-----");
					try{
				sleep(1000);
				
			}
			catch(InterruptedException ie){
			return;
		}
		}
			
	}
}