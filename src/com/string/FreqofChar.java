package com.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FreqofChar {


	public static void main(String[] args) {
		//		
		String str="one% fish, two fish, three fish fis";
		int[] freq = new int[str.length()];  
		int temp[];
		//		String sub="cla";
//		
//		if(str.contains(sub))
//		{
//			str=str.replaceAll(sub, "");
//			System.out.println(str);
//		}
//		else
//		{
//				
//		 System.out.println("Does not contain substring");
//		
//		}
		
	/*	String myString = "one fish, two fish, three fish fis";

		String target = "fish";
		String replacement = "sheep";
		String mystString=myString.replace('i', 'b');
		System.out.println(mystString);*/

     
		//	char ch[]=str.toCharArray();
		//	Map<Character,Integer> map=new LinkedHashMap();
		//	for(char cha:ch)
		//	{
		//		Integer count=map.get(cha);
		//		if(count==null)
		//		{
		//			map.put(cha, 1);
		//		}
		//		else
		//			map.put(cha, ++count);
		//	}
		//	for(Entry<Character,Integer> m:map.entrySet())
		//	{
		//			System.out.println("Count of word : "+m.getKey()+" is : "+m.getValue());
		//	}
		//
         char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
		               freq[i]++;
					   ch[j]='0';
				}
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(ch[i]!=' '&&ch[i]!='0')
			{
				System.out.println(ch[i]+" : " +freq[i]);
				
			}
		}
 

	}
}
