package testingdemonstration;

public class FinalEx {
	
	public void finalize(){System.out.println("finalize called");}  
	
	public static void main(String[] args){  
		FinalEx f1=new FinalEx();  
		FinalEx f2=new FinalEx();  
		f1=null;  
		f2=null;  
		System.gc(); 
		
	}
}
