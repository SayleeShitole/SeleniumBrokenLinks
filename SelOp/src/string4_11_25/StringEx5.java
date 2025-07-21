package string4_11_25;

public class StringEx5 {

	
	//how to reverse the string 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programming";
		
		String word="";
		for(int i=str.length()-1;i>=0;i--)
		{
			 word=word+str.charAt(i);
		}
				
		System.out.println(word);
	}

}
