package ThreadsEx;

class ThEx extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class Demo4
{
	public static void main(String args[])
	{
		ThEx t1=new ThEx();
		ThEx t2=new ThEx();
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}