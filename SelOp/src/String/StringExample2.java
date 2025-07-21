package String;

//Java program to insert a string into another string 

public class StringExample2 {
	
	String originalString; 
    String stringToBeInserted;
	public static String inserString(String OriginalString, String StringTobeInserted, int index)
	{
		String NewString=new String();
		
		//String[] str = OriginalString.split(" ");
		
		
//		String[] str11 = originalstr.split(" ");
//		
//		for(int i=0;i<str11.length;i++)
//		{
//			System.out.println(str11[i]);
//			newstr=newstr+str11[i];
//			
//		}
		
		String str = OriginalString.replaceAll(" ", "");
		System.out.println(str);
		String str1=str.replaceAll("[^a-zA-Z]", "");
		for(int i=0;i<str1.length();i++)
		{
			NewString+=str1.charAt(i);
			
			if(i==index)
			{
				NewString+=StringTobeInserted;
			}
		}
		return NewString;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String OriginalString="My Name Is Saylee Shitole and working in IT industries, prashant and Sai";
		//String OriginalString="MyName";
		String StringTobeInserted="Kailas";
		int index=5;
		
		System.out.println("Original String "+OriginalString);
		System.out.println("String to be inserted "+StringTobeInserted);
		System.out.println("String to be inserted at index "+index);
		
		System.out.println("Modified String: "
                + inserString(OriginalString, 
                		StringTobeInserted, 
                               index));
		
		
	}

	 // Function to insert string 
//    public static String insertString( 
//        String originalString, 
//        String stringToBeInserted, 
//        int index) 
//    { 
//  
//        // Create a new string 
//        String newString = new String(); 
//  
//        for (int i = 0; i < originalString.length(); i++) { 
//  
//            // Insert the original string character 
//            // into the new string 
//            newString += originalString.charAt(i); 
//  
//            if (i == index) { 
//  
//                // Insert the string to be inserted 
//                // into the new string 
//                newString += stringToBeInserted; 
//            } 
//        } 
//  
//        // return the modified String 
//        return newString; 
//    } 
//  
//    // Driver code 
//    public static void main(String[] args) 
//    { 
//  
//        // Get the Strings 
//        String originalString = "GeeksGeeks"; 
//        String stringToBeInserted = "For"; 
//        int index = 4; 
//  
//        System.out.println("Original String: "
//                           + originalString); 
//        System.out.println("String to be inserted: "
//                           + stringToBeInserted); 
//        System.out.println("String to be inserted at index: "
//                           + index); 
//  
//        // Insert the String 
//        System.out.println("Modified String: "
//                           + insertString(originalString, 
//                                          stringToBeInserted, 
//                                          index)); 
//    } 
}
