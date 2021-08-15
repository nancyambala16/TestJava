package ProveImmutability;


class Comp{
	int i=100;
	public Comp()
	{
		System.out.println("Comp Constructor");
	}
    public void testComp()
    {
    	System.out.println("Base Composition test class");
    }
}

class CompTest 
{
	static Comp comp=new Comp();
	public CompTest() {
		System.out.println("CompTest Constructor");
	}
	public void dummy()
	{
		System.out.println("Dummy test");
	}
}

public class CompositionTest {
	
	public static void main(String[] args)
	{
		 CompTest co=new CompTest();
		 co.dummy();
		 int i=co.comp.i;
		i= co.comp.i=20;
		 System.out.println(i);
	     co.comp.testComp();
	}

}
