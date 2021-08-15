package com.Arrays;

public class LongestSubstring {

	public void LongestSubstring() {

		String s="abcabcbb";
		int len=s.length();
		System.out.println(len);
		StringBuffer sb=new StringBuffer();

		for(int i=0;i<len;i++)
		{
			sb=new StringBuffer();
			for( int j=i;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j)&&i!=j)
				{
					break;
				}
				else
				{   if(!sb.toString().contains(String.valueOf(s.charAt(j))))
				{
					sb.append(s.charAt(j));

				}
				}
			}
			
			System.out.println(sb.toString());

		}		
	}

	public static void main(String[] args) {


		LongestSubstring ls=new LongestSubstring();
		ls.LongestSubstring();
	}


}
