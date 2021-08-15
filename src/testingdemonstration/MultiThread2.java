package testingdemonstration;

public class MultiThread2 extends Thread{
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i +"  "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		MultiThread2 t1=new MultiThread2();
		MultiThread2 t2=new MultiThread2();
		MultiThread2 t3=new MultiThread2();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
