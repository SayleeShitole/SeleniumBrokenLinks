package extraprogrammes;

import java.util.Arrays;

public class LargestAndSmallestEleInArray {

	//find the largest and smalled element in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,6,5,989898,76767676,-989898,0,-1,-25};
		
		int largest = arr[0];
		
		int smallest = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Largest element in array is : "+largest);
		
		System.out.println("Smallest element in array is : "+smallest);
	}

}
