package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initalize an array
        int[] arr={0,1,2,3,100,9999};
        
        //print the first number and last number
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        
        //reverse order
        for(int i=arr.length-1;i>=0; i--)
        {
            
            System.out.println(arr[i]);
        }
        
        
        //total number
        int total=arr.length;
        System.out.println("Toatl number of element within the numbers array : "+total);
        
    }
	

}
