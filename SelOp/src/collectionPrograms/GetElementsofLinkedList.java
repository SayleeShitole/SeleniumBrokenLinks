package collectionPrograms;

import java.util.LinkedList;
import java.util.List;

public class GetElementsofLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li=new LinkedList();
		
		li.add("Saylee");
		li.add("anu");
		li.add("Saylee");
		
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
	li.clear();
	
	System.out.println(li);
	}

}
