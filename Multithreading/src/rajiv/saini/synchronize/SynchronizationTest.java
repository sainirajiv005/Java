package rajiv.saini.synchronize;

public class SynchronizationTest
{
	public static void main(String[] args)
	{
		Display d = new Display();
		MyThread mt1 = new MyThread(d, "Rajiv");
		MyThread mt2 = new MyThread(d, "Saini");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();

	}
}
