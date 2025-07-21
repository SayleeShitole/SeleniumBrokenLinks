package extraprogrammes;

public class ExtractDigitsFromAlphanumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc123snbnb4567";
		
		ExtractDigitsFromAlphanumericString(str);
		
		System.out.println(ExtractDigitsFromAlphanumericString(str));

	}
	
	public static String ExtractDigitsFromAlphanumericString(String str)
	{
		StringBuilder str1=new StringBuilder();
		
		for(char c:str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				str1.append(c);
			}
		}
		
		
		
		return str1.toString();
	}

}
