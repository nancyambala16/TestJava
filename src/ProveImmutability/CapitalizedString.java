package ProveImmutability;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CapitalizedString {

	public static void main(String[] args) {
		
		String str="Welcome to Java";
		String[] s1=str.split(" ");
		
		int len=s1.length;
		System.out.println(len);
		String upperString="";
	    for (String uppercase:s1)	
	    {
	    	upperString=upperString+uppercase.toUpperCase()+" ";
	    	System.out.println(upperString);
	    }
		System.out.println(upperString);
	}
}
