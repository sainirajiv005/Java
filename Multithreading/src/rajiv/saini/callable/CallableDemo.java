package rajiv.saini.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo
{
	public static void main(String[] args) throws Exception
	{
		SumOfNumber[] jobs = {
								new SumOfNumber(10),
								new SumOfNumber(20),
								new SumOfNumber(30),
								new SumOfNumber(40),
								new SumOfNumber(50),
								new SumOfNumber(60)};
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(SumOfNumber job : jobs)
		{
			Future f = executor.submit(job);
			System.out.println(f.get());
		}
		executor.shutdown();
	}
}
