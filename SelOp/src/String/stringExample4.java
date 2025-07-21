package String;

public class stringExample4 {

	public static String insertString(String OriginalString,String StringToBeAdded, int index )
	{
		String newString=new String();
		for(int i=0;i<OriginalString.length();i++)
			
		{
			
			char c=OriginalString.charAt(i);
			newString=newString+c;
			if(i==index)
			{
				newString+=StringToBeAdded;
			}
		}
		
		return newString;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String OriginalString="GeeksGeeks";
		String StringToBeAdded="For";
		int index=4;
		
		System.out.println("Newly added string:"+insertString(OriginalString,StringToBeAdded,index));
		

	}

}
