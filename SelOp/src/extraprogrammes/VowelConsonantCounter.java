package extraprogrammes;

import java.util.LinkedList;
import java.util.List;

public class VowelConsonantCounter {
	
	
	public static void main(String[] args)
	
	{
		String str="Saylee";
		
		str=str.toLowerCase();
		
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' &&  ch<='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels: " + vowels + ", Consonants: " +
				consonants);
		
//		String str="Saylee";
//		  
//		  str = str.toLowerCase();
//		 int vowels = 0, consonants = 0;
//
//		 List<Character> li=new LinkedList<Character>();
//		 
//		 List<Character> l=new LinkedList<Character>();
//		 for(int i=0;i<str.length();i++)
//
//		 {
//			 char c=str.charAt(i);
//			 if(c>='a' && c<='z')
//			 {
//			 if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
//					 ) {
//				 li.add(c);
//			 }
//			 else
//			 {
//				 l.add(c);
//			 }
//			 }
//		 }
//		 System.out.println(li+" "+l);
	}

}
