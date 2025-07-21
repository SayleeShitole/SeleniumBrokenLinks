package extraprogrammes;

import java.util.LinkedList;
import java.util.List;

public class CountNoOfEvenOddDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12056;
		
		int evenCount=0;
		int oddCount=0;
		
		if(num==0)
		{
			evenCount=1;
		}
		else
		{
			while(num>0)
			{
				int digits=num%10;
				
				if(digits%2==0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
				num=num/10;
			}
		}
		
		 System.out.println("Even digits: " + evenCount);
	        System.out.println("Odd digits: " + oddCount);
	        
//	        int num=254789;
//			int rem=0;
//			List<Integer> odd=new LinkedList<Integer>();
//			List<Integer> even=new LinkedList<Integer>();
//			while(num>0)
//			{
//				int digits=num%10;
//				
//				if(!(digits%2==0))
//				{
//					even.add(digits);
//					
//				}
//				else
//				{
//					odd.add(digits);
//				}
//				num=num/10;
//				
//			}
//			System.out.println(even+" "+odd);
	        
	        
	       
	                int num1 = 254789;

	                String odd = "";
	                String even = "";

	                while (num1 > 0) {
	                    int digit = num1 % 10;

	                    if (digit % 2 == 0) {
	                        even = digit + even; // add at beginning for correct order
	                    } else {
	                        odd = digit + odd;
	                    }

	                    num1 = num1 / 10;
	                }

	                String result = odd + even;
	                System.out.println("Odd digits on left, even digits on right: " + result);
	         

	}

}
