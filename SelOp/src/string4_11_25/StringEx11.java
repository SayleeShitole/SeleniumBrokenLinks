package string4_11_25;

import java.util.Arrays;

public class StringEx11 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		String str="saylee";
//		
//		char[] word = str.toCharArray();
//		
//		for(int i=0;i<word.length;i++)
//		{
//			for(int j=0;j<word.length;j++)
//			{
//				if(word[i]<word[j])
//				{
//				char temp = word[i];
//				word[i]=word[j];
//				word[j]=temp;
//				}
//			}
//		}
//		String sorted=new String(word);
//		System.out.println("sorted string is "+sorted);
//
//	}
//	
//	
	
	public static void main(String[] args)
	{
		String str="prashant";
		
		
		
		char[] str1 = str.toCharArray();
		
		 Arrays.sort(str1);
		 
		 String str11=new String(str1);
		 
		 System.out.println(str11);
		
		System.out.println();
		
		
	}

}
