package extraprogrammes;

import java.util.ArrayList;

public class EvenOddNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] str= {2,3,7,9,10,46,22};
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]%2==0)
			{
				System.out.println("even no : "+str[i]);
				
			}
			else
			{
				System.out.println("odd no : "+str[i]);
				
			}
		}
//		 int arr[]= {2,7,8,6,9,4};
//		  
//		  ArrayList<Integer> even=new ArrayList<Integer>();
//		  ArrayList<Integer> odd=new ArrayList<Integer>();
//		  
//		  for(int i=0;i<arr.length;i++)
//		  {
//			  if(arr[i]%2==0)
//			  {
//				  even.add(arr[i]);
//			  }
//			  else
//			  {
//				  odd.add(arr[i]);
//			  }
//		  }
//		  System.out.println(even+" "+odd);

	}

}
