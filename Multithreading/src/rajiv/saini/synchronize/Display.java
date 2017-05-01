package rajiv.saini.synchronize;

public class Display
{
	public void wish(String name)
	{
		for (int i = 0; i < 10; i++)
		{
			synchronized (this)
			{
				System.out.println("Hello " + name);
				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
				}
			}
		}
	}
}
