package ProveImmutability;

import java.util.Set;

public class RemoveVowel {
	
	public static void main(String[] args) {
		
		String str= "apple is our frUIt";
	    str= str.replaceAll("[aieouAIEOU]", "");
		System.out.println(str);
		
		String newStr="apple,mango is our fruit";
		Set vowel=Set.of('a','i','e','o','u');
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<newStr.length();i++)
		{
			if(!vowel.contains(newStr.charAt(i)))
			{
				sb.append(newStr.charAt(i));
			}
		}
		newStr=sb.toString();
		System.out.println(newStr);
		
		
	}

}
