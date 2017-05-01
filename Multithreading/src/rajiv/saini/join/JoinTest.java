package rajiv.saini.join;

class XYZ implements Runnable
{
	static Thread thread;

	public void run()
	{
		for (int i = 0; i < 20; i++)
		{
			if (i == 5 && Thread.currentThread().getName().trim().equals("Child Thread T1"))
			{
				try
				{
					thread.join();
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/*
			 * if (i == 10 && Thread.currentThread().getName().trim().equals(
			 * "Child Thread T2")) { try { thread.join(); } catch
			 * (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } }
			 */
			System.out.println(Thread.currentThread().getName() + i);
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class JoinTest
{
	public static void main(String[] args) throws InterruptedException
	{
		XYZ xyz = new XYZ();
		// XYZ.thread = Thread.currentThread();
		Thread t1 = new Thread(xyz, "\tChild Thread T1\t");
		Thread t2 = new Thread(xyz, "\t\t\t\t\t\t\t\t\tChild Thread T2\t");

		t1.start();
		t2.start();

		XYZ.thread = t2;

		Thread.currentThread().setName("\tMainThread");
		for (int i = 0; i < 20; i++)
		{

			System.out.println("\t\t\t\t\t" + i + Thread.currentThread().getName());
			Thread.currentThread().sleep(500);

			if (i == 5)
			{
				t1.join(10000);
			}

		}
	}
}
