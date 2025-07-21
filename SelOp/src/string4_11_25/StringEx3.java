package string4_11_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringEx3 {

	//How to find duplicate characters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programming";
		
		char[] str1 = str.toCharArray();
		
		HashMap<Character, Integer> li=new HashMap<>();
		
		for(char a:str1)
		{
			li.put(a, li.getOrDefault(a, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:li.entrySet())
		{
			if(entry.getValue()>1)
		{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}

	}

}
