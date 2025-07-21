package string4_11_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// How to count the repeated words in given string 
public class StringEx1 {
	
//	public static void main(String[] args)
//	{
//		String str= "Saylee Saylee Shitole Shitole";
//		String[] words = str.split(" ");
//		
//		HashMap<String, Integer> li=new HashMap<>();
//		for(String str11:words)
//		{
//			li.put(str11, li.getOrDefault(str11, 0)+1);
//			
//		}
//		
//		
//		for (Map.Entry<String, Integer> entry : li.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
//            }
//        }
//
//	}
//	public static void main (String[] args)
//	{
//		
//        String str="I am learning java, java and java for my understanding";
//        
//        
//        String[] s1 = str.split(" ");
//		
//	
//		
//        
//        HashMap<String, Integer> map=new HashMap<String, Integer>();
//        
//        for(String word:s1)
//        
//        {
//        	String word1=word.replaceAll("[^a-zA-Z]", "");
//        	map.put(word1, map.getOrDefault(word1, 0)+1);
//        	
//        }
//        
//        for(Map.Entry<String, Integer> entry:map.entrySet())
//        {
//        	
//        		System.out.println(entry.getKey()+" : "+entry.getValue());
//        	
//        }
//        
//        
//	}
//	
	public static void main(String[] args)
	{
		String[] str= {"Apple", "Banana", "Apple", "Orange", "Banana",
			 "Orange", "Orange", "Apple"};
		
		HashMap<String,Integer> li= new HashMap<>();
		
		for(String str1:str)
		{
			li.put(str1, li.getOrDefault(str1, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry :li.entrySet())
		{
			if(entry.getValue()>=1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}

}
