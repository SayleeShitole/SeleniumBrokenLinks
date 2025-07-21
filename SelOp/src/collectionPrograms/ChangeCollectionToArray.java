package collectionPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeCollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		lis.add("saylee");
//		lis.add(3);
//		lis.add(true);
//		
//		Object[] arr = lis.toArray();
//		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		
		BufferedReader in = new BufferedReader(
	            new InputStreamReader(System.in));
	        // 'in' is object created of this class
	 
	        // Creating object of Scanner class
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println("enter the string");
	        // Creating ArrayList to store user input
	        List<String> list = new ArrayList<String>();
	 
	        // Taking input from user
	        // adding elements to the list
	        while (sc.hasNext()) {
	            String i = sc.nextLine();
	            list.add(i);
	        }
	 
	        // Converting list to an array
	        Object[] str = list.toArray();
	 
	        // Iteration over array
	        for (int i = 0; i < str.length; i++) {
	            //String data = str[i];
	 
	            // Printing the elements
	            System.out.print(str[i]);
	        }
	}

}
