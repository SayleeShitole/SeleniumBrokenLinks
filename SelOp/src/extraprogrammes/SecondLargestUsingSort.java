package extraprogrammes;

import java.util.Arrays;

public class SecondLargestUsingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr[]= {22,50,7,88,99,97};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
		 System.out.println(Arrays.toString(arr));
		
		 System.out.println("Second largest number from array: "+arr[1]);
		 
		 int arr1[]= {64, 34, 25, 12, 22, 11, 90};
		 
		 for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr1[i]>arr1[j])
					{
						int temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
						
					}
				}
				
			}
		 System.out.println(Arrays.toString(arr1));
		 System.out.println("Second smallest number from array: "+arr1[1]);
	}

}
