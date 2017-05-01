package rajiv.saini.executor;

public class Display implements Runnable
{
	String name;

	Display(String name)
	{
		this.name = name;
	}

	public void run()
	{
		System.out.println(name + ".... Job Started by " + Thread.currentThread().getName());
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "..... Job Completed by " + Thread.currentThread().getName());
	}
}
