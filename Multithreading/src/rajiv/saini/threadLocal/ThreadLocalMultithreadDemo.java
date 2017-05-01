package rajiv.saini.threadLocal;

class Customer extends Thread
{
	static int customerId = 0;
	private static ThreadLocal tl = new ThreadLocal()
	{
		protected Integer initialValue()
		{
			return ++customerId;
		}
	};

	Customer(String name)
	{
		super(name);
	}

	public void run()
	{
		System.out.println(Thread.currentThread().getName() + "\tis executed by\t" + tl.get());
	}
}

public class ThreadLocalMultithreadDemo
{
	public static void main(String[] args)
	{
		Customer t1 = new Customer("Rajiv");
		Customer t2 = new Customer("Aman");
		Customer t3 = new Customer("Abhi");
		Customer t4 = new Customer("Akshit");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
