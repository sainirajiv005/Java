package rajiv.saini.yield;

class XYZ implements Runnable
{
	public void run()
	{
		try
		{

			method1();

		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void method1() throws InterruptedException
	{
		for (int i = 0; i < 20; i++)
		{
			if (Thread.currentThread().getName().trim().equals("Child T1"))
			{
				System.out.println("\t\t\t\t\t\t\t\t\t\tT1 SKIPPED");
				Thread.currentThread().yield();
			}
			System.out.println(Thread.currentThread().getName() + "\t" + i);

		}
	}
}

public class YieldTest
{
	public static void main(String[] args)
	{
		XYZ xyz = new XYZ();
		Thread t1 = new Thread(xyz, "Child T1");
		Thread t2 = new Thread(xyz, "\t\t\t\tChild T2");
		// t1.setPriority(Thread.MIN_PRIORITY);
		// t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}
}
