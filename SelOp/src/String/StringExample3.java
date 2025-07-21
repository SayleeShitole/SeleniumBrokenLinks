package String;

public class StringExample3 {
	
	public static void printCount(String str)
	{
		String[] s1 = str.split(" ");
		
		for(String str2:s1)
		{
		String str3 = str2.replaceAll("[^a-zA-Z]", "");
			if(str3.length()%2==0)
			{
				System.out.println(str3);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Mye name is Saylee, prashant and sai";
		StringExample3.printCount(str);
		
	}

}
