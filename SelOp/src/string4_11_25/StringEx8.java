package string4_11_25;

import java.util.LinkedHashMap;
import java.util.Map;
//how to find the firstnon replace character in string 
public class StringEx8{
	
	public static void main(String[] args)
	{
		String str="swiss";
		//linked hashmap maintained the insertion order
		Map<Character,Integer> map=new LinkedHashMap<>();
	
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
			System.out.println(entry.getKey());
			break;
			}
		}
		
	}

}
