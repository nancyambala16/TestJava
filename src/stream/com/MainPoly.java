package stream.com;

class sample1
{
	void test()
	{
		System.out.println("Sample1 test");
	}
	
	void test(int a)
	{
		System.out.println("Sample1 test");
	}
}

class sample2 extends sample1
{
	void test()
	{
		System.out.println("Sample2 test");
	}
}

class sample3 extends sample1
{
	void test()
	{
		System.out.println("Sample3 test");
	}
}

class exec
{

	void exc(sample1 s)
	{
		s.test();
	}
}

public class MainPoly {

public static void main(String[] args) {
	
		   exec ex=new exec();
		   ex.exc(new sample3());

}

}
