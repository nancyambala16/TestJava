package stream.com;


public class HashCodeImp {
	private static int hashnum=101;
	public int hashcode()
	{
		return hashnum++;
	}
	
	public boolean equals(Object o)
	{
		HashCodeImp imp=(HashCodeImp)o;
		return (this.hashcode()==imp.hashcode());
	}
	
	
	public static void main(String[] args) {
		
		HashCodeImp hc=new HashCodeImp();
		HashCodeImp hc1=hc;
		System.out.println(hc.equals(hc1));
         int i=hc.hashcode();
         System.out.println(i);
         i=hc.hashcode();
         System.out.println(i);
         
     	
	}

}
