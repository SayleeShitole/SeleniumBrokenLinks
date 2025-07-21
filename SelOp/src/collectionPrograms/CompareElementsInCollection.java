package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElementsInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li=new ArrayList();
		
//		li.add(10);
//		li.add(2);
//		li.add(15);
//		li.add(8);
//		li.add(0);
//		
//		Object min = Collections.min(li);
//		
//		Object max = Collections.max(li);
//		
//		
//		if(min==max)
//		{
//			System.out.println("All elements are equal");
//		}
//		
//		else
//		{
//			System.out.println(min +" "+max);
//		}

		li.add("k");
		li.add("n");
		li.add("a");
		li.add("Shi");
		
		Object min = Collections.min(li);
		
		Object max=Collections.max(li);
		
		if(!min.equals(max))
		{
			System.out.println(min +" "+max);
		}
		else
		{
			System.out.println("All elements are equal");
		}
		
		
		
	}

}
