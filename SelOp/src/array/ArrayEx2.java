package array;

public class ArrayEx2 {
	
	public static void main(String[] args)
	
	{
		int[] arr= {1,2,4,6,8,10,24,11,56,144};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is multiple of 2");
				
			}
			else
			{
				System.out.println(arr[i]+" is not multiple of 2");
			}
		}
		
	}

}
