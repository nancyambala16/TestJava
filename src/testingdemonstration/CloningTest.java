package testingdemonstration;

public class CloningTest implements Cloneable{

	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloningTest obj=new CloningTest();
		obj.i=30;
		obj.j=40;
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		CloningTest obj1=obj;
		obj1.i=30;
		obj1.j=50;
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		
		CloningTest obj3=(CloningTest)obj.clone();
		obj3.j=100;
        System.out.println(obj3.i+":"+obj3.j);
		
	}
}
