package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PracticePrograme { 

	   public static void main(String args[])
	   {
		
		   
		  String str="swiss";
		  Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		  for(int i=0;i<str.length();i++)
		  {
			  char c=str.charAt(i);
			  
			  if(!map.containsKey(c))
			  {
				  map.put(c, 1);
			  }
			  else
			  {
				  map.put(c, map.get(c)+1);
			  }
		  }
	   }
	   


	   
}