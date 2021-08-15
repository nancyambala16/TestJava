package testingdemonstration;

class InnerClass2 {
	
	public void show()
	{
		System.out.println("Show of Inneer Class");
	}

	 class A{
		int j=5;
	}
	 

	static class B{
			int j=15;
		}
		
	
	public static void main(String[] args) {
		
		InnerClass2 obj=new InnerClass2()
		{
			public void show()
			{
				System.out.println("overrided Show of Inneer Class");
			}
			
		};
		
		obj.show();
		
		A a=obj.new A();
		System.out.println(a.j);
	 B b= new InnerClass2.B();
	 System.out.println(b.j);
	}
	
}




