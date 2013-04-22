package guohao.test.thread;
//runnable接口并没有提供SLEEP等方法；

class JoinTest
{
	public static void main(String[] args)
	{
	    MyRunner r = new MyRunner();
		//MyThread thread = new MyThread("guohao");
	    //thread.setName("guohao");
	   Thread thread = new Thread(r);
		thread.start();
		try{
	    thread.join();}
		catch(InterruptedException ie){}
		for(int i = 0;i<100;i++)
		{
			System.out.println("i am main");
		}
	}
}

//class MyThread extends Thread
class MyRunner implements Runnable
{
	/*public MyRunner(String s )
	{
		super(s);
	}
	*/

	public void run()
	{
	    for(int i = 0;i<100;i++){
		//System.out.println("i am mythread " + getName());
		System.out.println("im thr-------");
		/*try{
			sleep(100);
		}
		catch(InterruptedException ie){}
		*/
	 	}
	
		
	}
}
 
