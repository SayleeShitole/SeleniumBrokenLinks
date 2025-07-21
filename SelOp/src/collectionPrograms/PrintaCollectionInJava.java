package collectionPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintaCollectionInJava {

//	String st;
//	int n;
//	PrintaCollectionInJava(int a,String str)
//	{
//			n=a;
//			st=str;
//	}
//	
//	public String toString()
//	{
//		return "Roll No : "+n+" | Name : "+st;
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		ArrayList<PrintaCollectionInJava> arr=new ArrayList<PrintaCollectionInJava>();
//		
//		PrintaCollectionInJava add1=new PrintaCollectionInJava(101,"Saylee");
//		PrintaCollectionInJava add2=new PrintaCollectionInJava(102,"Prashant");
//		PrintaCollectionInJava add3=new PrintaCollectionInJava(103,"Kailas");
//		PrintaCollectionInJava add4=new PrintaCollectionInJava(104,"Sai");
//		
//		arr.add(add1);
//		arr.add(add2);
//		arr.add(add3);
//		arr.add(add4);
//		
//		for(PrintaCollectionInJava arr1:arr)
//			
//		{
//			System.out.println(arr1);
//		}
//		
//	}

	String str1;
	String str2;

	PrintaCollectionInJava(String firstname, String lastname)

	{
		str1 = firstname;
		str2 = lastname;
	}

	public String toString() {
		return "Firstname : " + str1 + " | Lastname : " + str2;
	}

	public static void main(String[] args) {

		LinkedHashMap<Integer, PrintaCollectionInJava> li = new LinkedHashMap<Integer, PrintaCollectionInJava>();

		PrintaCollectionInJava add1 = new PrintaCollectionInJava("Saylee", "Phadatare");
		PrintaCollectionInJava add2 = new PrintaCollectionInJava("Prashant", "Phadatare");
		PrintaCollectionInJava add3 = new PrintaCollectionInJava("Kailas", "Shitole");
		PrintaCollectionInJava add4 = new PrintaCollectionInJava("Sai", "Shitole");

		li.put(101, add1);
		li.put(102, add2);
		li.put(103, add3);
		li.put(104, add4);

		for (Entry<Integer, PrintaCollectionInJava> entry : li.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
