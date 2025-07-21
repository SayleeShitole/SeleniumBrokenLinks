package extraprogrammes;

public class CheckIfArrayIsSortedOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,10,4,5};
		boolean isSorted=true;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					
					isSorted = false;
					break;
				}
			}
		}
		System.out.println("Array is sorted: "+isSorted);
}
	

	
}
