package extraprogrammes;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		
		int num=123456;
		
		int sum=0;
		
		while(num>0)
		{
			int digits=num%10;
			
			sum=sum+digits;
			
			num=num/10;
		}
		
		System.out.println("Sum of digits is : "+sum);

	}

}
