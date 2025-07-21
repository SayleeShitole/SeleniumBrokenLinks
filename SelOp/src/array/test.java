package array;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="saylee";
		
		HashSet<Character> set=new HashSet<Character>();
		
		
		for(char arr:s.toCharArray())
		{
			
			if(!set.contains(arr))
			{
				set.add(arr);
			}
			
		}
		System.out.println(set);
		
	// 254789
		
		
		
		
		
	}
		

}
