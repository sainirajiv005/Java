package rajiv.saini.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo
{
	public static void main(String[] args)
	{
		Display[] jobs = {new Display("Rajiv"),
						new Display("Aman"),
						new Display("Abhishek"),
						new Display("Gaurav"),
						new Display("Supriya"),
						new Display("Akshit")
						};
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(Display job : jobs)
		{
			executor.submit(job);
		}
		executor.shutdown();
	}
}
