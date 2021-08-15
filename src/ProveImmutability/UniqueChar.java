package ProveImmutability;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueChar {

	static char nonrep()
	{
		
		String word="javava";
	
		
				for (int i = 0; i < word.length(); i++) {
					char letter = word.charAt(i);
					if (!word.matches("(.*)" + letter + "(.*)" + letter + "(.*)"))
					{
				      return letter;
					}
				}
					return ' ';
				
	}

	public static void main(String[] args) {
		
		char ch=nonrep();
		System.out.println(ch);
	}
}
