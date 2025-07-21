package String;

//Reverse a String in Java

public class stringExample6 {
	
	public static String reverseString(String str)
	{
		String res=new String();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My Name Is Sayee";
		
		System.out.println("String reverse will be "+reverseString(str)); 

	}

}
