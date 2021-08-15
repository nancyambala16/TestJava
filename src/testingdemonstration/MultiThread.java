package testingdemonstration;

public class MultiThread implements Runnable{
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i +"  "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		MultiThread t1=new MultiThread();
		MultiThread t2=new MultiThread();
		MultiThread t3=new MultiThread();
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		Thread th3=new Thread(t3);
		th1.start();
		th2.start();
		th3.start();
		
	}

}
