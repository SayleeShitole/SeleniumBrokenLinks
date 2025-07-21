package string4_11_25;

public class StringEx10 {

//	public static void main(String[] args)
//	{
//		        String input = "banana";
//		        char[] chars = input.toCharArray();
//		        
//		        
//		        System.out.println();
//		        // Sort manually using basic comparisons only
//		        for (int i = 0; i < chars.length; i++) {
//		        	
//		            for (int j = 0; j < chars.length; j++) {
//		            	
//		            	
//		                // If char at i is smaller than char at j, swap them
//		                if (chars[i] < chars[j]) {
//		                	 
//		                    char temp = chars[i];
//		                   
//		                    chars[i] = chars[j];
//		                    chars[j] = temp;
//		                }
//		            }
//		        }
//
//		        String sorted = new String(chars);
//		        System.out.println("Sorted String: " + sorted);
//		   
//	}
	
	
	public static void main(String[] args)
	{
		//String str="saylee";
		
		String str1=new String("saylee");
		
		char[] st1 = str1.toCharArray();
		
		for(int i=0;i<st1.length;i++)
		{
			for(int j=i+1;j<st1.length;j++)
			{
				if(st1[i]>st1[j])
				{
					char temp=st1[i];
					st1[i]=st1[j];
					st1[j]=temp;
				}
			}
		}
		
		 StringBuilder sorted = new StringBuilder();
		
	     System.out.println("Sorted String: " + sorted.append(st1));
	}
	}
