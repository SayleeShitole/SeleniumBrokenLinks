package extraprogrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSettoListAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"Saylee","Shitole","kailas"};
		  
		   List<String> li = Arrays.asList(arr);
		  
		 Set<String> set=new HashSet<>(li);
		 
		 System.out.println(set);
		 
		 List<String> str=new ArrayList<String>(set);
		 
		 System.out.println(str);

	}

}
