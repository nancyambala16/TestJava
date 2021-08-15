package testingdemonstration;

import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;

public class IsSeq {
	public static void main(String[] args) {
		
		String str= "this is a test string";
		String pattern = "tist" ;
		int i=0;
		int j=0;
		
		
		while(i<str.length()&&j<pattern.length())
		{
			if(str.charAt(i)==pattern.charAt(j))	
			{
				j++;
			}
			i++;
		}
		
		if(pattern.length()==j)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}

	}
}