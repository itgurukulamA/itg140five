//No after starting a thread again it can never be started again.
//If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception
public class TestThreadTwice1 extends Thread{
public void run() {
	System.out.println("Thread is running");
}
	public static void main(String[] args) {
TestThreadTwice1 t1 = new TestThreadTwice1();
t1.run();
t1.start();
t1.start();
	}

}