package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayIntoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString[]
		
		String[] str= {"Saylee","Shitole","Kailas"};
		
		System.out.println(Arrays.toString(str));
		
		List<String> playersList=Arrays.asList(str);
		
		
		System.out.println(playersList);
		
		
		

	}

}
