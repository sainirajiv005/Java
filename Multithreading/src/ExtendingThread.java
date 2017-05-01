import java.util.concurrent.atomic.AtomicInteger;

class ABC extends Thread
{
	//public static int count=0;
	private final static AtomicInteger count = new AtomicInteger(0); 
	/*public synchronized static int getCount()
	{
		return ++count; 	
	}*/
	
	public  int getCount()
	{
		//synchronized(count)
		//{
			return count.getAndIncrement();
		//}
	}
	
	public void run()
	{
		synchronized(this)
		{
		for(;getCount()<15;)
		{
			System.out.println(Thread.currentThread().getName() +"\t:"+ count );
			try
			{Thread.currentThread().wait(500);}
			catch(InterruptedException e)
			{
				System.out.println("\t\tInterrupt");
			}
		}
		}
	}
}

public class ExtendingThread 
{
	public static void main(String[] args)
	{
		ABC abc = new ABC();
		abc.setName("Thread 1");
		abc.start();
		ABC xyz = new ABC();
		xyz.setName("\t\t\t\tThread 2");
		xyz.start();
		System.out.println(Thread.currentThread().getName() + "Main Exit");
		
	}
	
	
}
