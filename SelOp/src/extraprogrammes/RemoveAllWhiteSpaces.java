package extraprogrammes;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My  Name  Is  Saylee";
		
//		String res = str.replaceAll("\\s+", "");
//		
//		/System.out.println(res);
		
		System.out.println(iswhiteSpaces(str));

	}
	
	public static String iswhiteSpaces(String str)
	{
		StringBuilder res=new StringBuilder();
		
		for(char c:str.toCharArray())
		{
			if(!Character.isWhitespace(c))
			{
				res.append(c);
			}
		}
		
		return res.toString();
	}
}
