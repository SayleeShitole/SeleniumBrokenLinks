package extraprogrammes;

public class CaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Java Programming";
		
		char[] str1=str.toCharArray();
		StringBuilder result = new StringBuilder();
		for (char c : str1) {
			 if (Character.isUpperCase(c)) {
			 result.append(Character.toLowerCase(c));
			 } else if (Character.isLowerCase(c)) {
			 result.append(Character.toUpperCase(c));
			 } else {
			 result.append(c);
			 }
		}
		
		System.out.println(result);
	}

}
