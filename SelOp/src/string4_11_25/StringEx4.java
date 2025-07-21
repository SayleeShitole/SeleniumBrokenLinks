package string4_11_25;

import java.util.HashMap;

public class StringEx4 {
	
	// How to check if two strings are ANAGRAM
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="listen";
		String str2="silent";
		
		if(isAnagram(str1,str2))
		{
			System.out.println("This string is anagram");
		}
		else
		{
			System.out.println("This string is not anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2)
	{
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		char[] c=str1.toCharArray();
		HashMap<Character,Integer> li=new HashMap<>();
		for(char a:c)
		{
			li.put(a, li.getOrDefault(a, 0)+1);
		}
		
		
		for(char a:str2.toCharArray())
		{
			if(!li.containsKey(a))
			{
				return false;
			}
			li.put(a, li.get(a)-1);
			if(li.get(a)==0) {
				li.remove(a);
			}
		}
		
		return li.isEmpty();
	}
}
