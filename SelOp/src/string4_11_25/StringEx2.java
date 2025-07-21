package string4_11_25;

import java.util.HashMap;
import java.util.Map;

public class StringEx2 {

	//How to count character Occurrence in a given String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java is object oriented programming language";
		
		String str1 = str.replaceAll(" ", "");
		
		char[] ch = str1.toCharArray();
		
		HashMap<Character,Integer> li=new HashMap<>();
		
		for(char a:ch)
			
		{
				li.put(a, li.getOrDefault(a, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry :li.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
