package rajiv.saini.callable;

import java.util.concurrent.Callable;

public class SumOfNumber implements Callable
{
	int num;

	SumOfNumber(int n)
	{
		num = n;
	}

	public Object call() throws Exception
	{
		System.out
				.println(Thread.currentThread().getName() + " is responsible to find sum of first " + num + " numbers");
		Thread.sleep(2000);
		int sum = 0;
		for (int i = 0; i < num; i++)
		{
			sum += i;
		}
		return sum;
	}
}
