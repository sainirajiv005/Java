package rajiv.saini.threadLocal;

public class ThreadLocalInitializingDemo
{
	public static void main(String[] args)
	{
		ThreadLocal tl = new ThreadLocal()
		{
			public Object initialValue()
			{
				return "Rajiv";
			}
		};

		System.out.println("Before Initializing : " + tl.get());
		tl.set("Rajiv Saini");
		System.out.println("After Setting : " + tl.get());
		tl.remove();
		System.out.println("After remove : " + tl.get());
	}
}
