package extraprogrammes;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	//find the duplicate element in array using hashset
//public static void main(String[] args)
//{
//	 int[] arr = {1, 2, 3, 2, 4, 5, 1};
//
//     Set<Integer> seen = new HashSet<>();
//     Set<Integer> duplicates = new HashSet<>();
//
//     for (int num : arr) {
//    	
//    	 
//         if (!seen.add(num)) { // add() returns false if already present
//             duplicates.add(num);
//         }
//     }
//
//     System.out.println("Duplicate elements: " + duplicates);
// }
	
	
	
	public static void main(String[] args)
	{
		int[] arr= {1,1,2,8,5,6,8,6};
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					flag=true;
					break;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}
	}
}

