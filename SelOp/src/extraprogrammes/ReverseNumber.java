package extraprogrammes;

public class ReverseNumber {

	public static void main(String[] args) {

		int num=12389;
		
		System.out.println("The reverse number is : "+isValidate(num));

	}
	
	public static int isValidate(int num)
	{
		
		int reverse =0;
		
		while(num>0)
		{
			int digits=num%10;
			reverse=reverse*10+digits;
			num=num/10;
		}
		
		return reverse;
		
		
	}

}
