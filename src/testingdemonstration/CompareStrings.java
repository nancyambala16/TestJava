package testingdemonstration;

public class CompareStrings {

	
	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";
        System.out.println("Comparing String "+s1==s2);
        System.out.println("Comparing String "+(s1==s2));
        System.out.println(s1==s2);
        
        System.out.println("****************************");
        
        String s4=new String("Value");
        String s5=new String("Value");
        String s6=s4;
        System.out.println(s4==s5);
        System.out.println(s6==s4);
        System.out.println(s4.equals(s5));
	}
}
