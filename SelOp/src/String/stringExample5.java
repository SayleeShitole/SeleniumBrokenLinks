package String;

//Java Program to Check Whether a String is a Palindrome
public class stringExample5 {
	
	public static boolean isBoolean(String str) {
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		
		{
			rev=rev+str.charAt(i);
		}
		
		if(!(str.equals(rev)))
		{
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		
		boolean res=isBoolean(str);
		
		if(res)
		{
			System.out.println("String "+str+" is palindrome");
		}
		else
		{
			System.out.println("String "+str+" is not palindrome");
		}
	}
	
	

}
