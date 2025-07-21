package String;

//Java program to print Even length words in a String
public class StringExample1 {
	
	public static void printCount(String s)
	
	{
		String[] s1 = s.split(" ");
		
		
		for(String s3:s1)
		{
			String word=s3.replaceAll("[^a-zA-Z]", "");
			if(word.length()%2==0)
				
			{
				System.out.println(word+"");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="My Name Is Saylee Shitole and working in IT industries, prashant and Sai";
		StringExample1.printCount(s);

	}

}
