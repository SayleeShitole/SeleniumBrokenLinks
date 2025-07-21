package extraprogrammes;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=13391;
		
		boolean result=isValidate(num);
		
		//System.out.println("The reverse number is : "+result);
		
		if(result)
		{
			System.out.println("The given number is palindome");
		}
		else 
		{
			System.out.println("The given number is not palindome");
		}
	}
	
	public static boolean isValidate(int num)
	{
		int original=num;
		int reverse =0;
	
	while(num>0)
	{
		int digits=num%10;
		reverse=reverse*10+digits;
		num=num/10;
	}
		
		if(!(original==reverse))
		{
			return false;
		}
		return true;
	}

}
