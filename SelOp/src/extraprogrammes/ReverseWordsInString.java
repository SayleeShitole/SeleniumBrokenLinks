package extraprogrammes;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Java Coding Interview";
		 String[] words = sentence.split(" ");
		 String res="";
		 for(String word:words)
		 {
			 for(int i=word.length()-1;i>=0;i--)
			 {
				 res=res+word.charAt(i);
			 }
		 }

		 System.out.println(res);
}


}
