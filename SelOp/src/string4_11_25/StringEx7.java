package string4_11_25;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="racecar";
		
		boolean result = isVaidate(str);
		
		if(result)
		{
			System.out.println("This string is palindrome");
		}
		else
		{
			System.out.println("This string is not palindrome");
		}
		
	}
	
	public static boolean isVaidate(String str)
	{
		
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result=result+str.charAt(i);
		}
		
		if(!(str.equals(result)))
		{
			return false;
		}
		return true;
	}
	

}
