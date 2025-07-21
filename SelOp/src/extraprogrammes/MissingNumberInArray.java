package extraprogrammes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		int[] arr= {1,2,3,5,6,7,8,9,10};
//		
//		int sum=0;
//		int expectedSum=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		
//		for(int i=1;i<=10;i++)
//		{
//			expectedSum=expectedSum+i;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println("Missing number in array : "+(expectedSum-sum));
//
//	}
	
	//find multiple missing numbers in array
	public static void main(String[] args)
	{
		int[] arr=  {1,2,3,5,7,9};
		
		int n=9;
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int num:arr)
		{
			set.add(num);
		}
		
		System.out.print("Missing numbers in array is : ");
		
		for(int i=0;i<=n;i++)
		{
			if(!set.contains(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
