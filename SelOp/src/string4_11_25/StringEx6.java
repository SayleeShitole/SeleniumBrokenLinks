package string4_11_25;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to reverse sentence words
		
		String str3="I like java programming";
		
		String result="";
		
		for(int i=str3.length()-1;i>=0;i--)
		{
			result=result+str3.charAt(i);
		}
		
		System.out.println(result);

	}

}
