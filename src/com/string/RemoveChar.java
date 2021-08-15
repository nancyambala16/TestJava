package com.string;

public class RemoveChar {

	static String removeChar(String str,char i)
	{
	    String s=Character.toString(i);
	    return str.replace(s, "");
	}
	
	static String remove(String str,char ch)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==ch))
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
	String sb=remove("geeksforgeeks",'g');
	System.out.println(sb);
	
	String str="Testidng world";
	int ind=str.indexOf('d');
	System.out.println(ind);
	str=str.substring(0,ind)+str.substring(ind+1);
	System.out.println(str);
	
	}
}
