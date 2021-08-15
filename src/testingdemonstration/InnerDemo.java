package testingdemonstration;

interface DemoTest
{
	public void show();
}

public class InnerDemo
{
	public static void main(String[] args) {
		
		DemoTest obj=()->
		{
			System.out.println("SHOW OVERRIDDEN");
		};
		
		obj.show();
		
		
	}
}