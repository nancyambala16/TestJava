package ProveImmutability;

class DemoLearn1
{
	int i=20;
	void demo1()
	{
		System.out.println("demo1");
	}
}


class DemoLearn2 extends DemoLearn1
{
	int i=10;
	void demo2()
	{
		System.out.println("Printing Parent class i value : "+super.i);
		System.out.println("demo2");
	}
	
	void demo1()
	{
		System.out.println("overriding demo1");
	}
	
}

public class InheritancePrac {
	
	public static void main(String[] args) {
		
		DemoLearn2 dl2=new DemoLearn2();
		System.out.println(dl2.i);
		dl2.demo2();
		dl2.demo1();		
		System.out.println("**********Priting parent class data************");
		DemoLearn1 dl1=new DemoLearn1();
		System.out.println(dl1.i);
		//dl1.demo2(); cannot called child class members with reference of parent class
		dl1.demo1();
		System.out.println("***********Priting with parent class reference*********");
		DemoLearn1 dl3=new DemoLearn2();
		System.out.println(dl3.i);
	//	dl3.demo2();
		dl3.demo1();	
		
		
		
	}

}
