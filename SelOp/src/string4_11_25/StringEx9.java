package string4_11_25;

public class StringEx9 {
	
	public static void main(String[] args)
	{
		StringBuilder str=new StringBuilder();
		
		str=str.append("www.google.com");
		
		System.out.println(str);
		
		String str1 = str.substring(str.length()-4, str.length());
		
		System.out.println(str1);
	}

}
