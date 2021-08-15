package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWord {

	public static void main(String[] args) {
		
		String str="Java is Java is Prog";
		
		String s[]=str.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		
		for(String st:s)
		{
			Integer count=map.get(st);
			if(count==null)
			{
				map.put(st, 1);
			}
			else
				map.put(st, ++count);
		}
		
		System.out.println(map);
		for(Entry<String,Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println("Duplicate word is: "+m.getKey());	
			
			}
		}
	}
}
