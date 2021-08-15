package com.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingChar {

	public static void main(String[] args) {
		
		
		String str="jamkvaja";
		char ch[]=str.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap();
		for(char cha:ch)
		{
			Integer count=map.get(cha);
			if(count==null)
			{
				map.put(cha, 1);
			}
			else
				map.put(cha, ++count);
		}
		for(Entry<Character,Integer> m:map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println("Unique word is: "+m.getKey());
			}
		}
	}
}
