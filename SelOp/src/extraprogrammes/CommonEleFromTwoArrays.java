package extraprogrammes;

import java.util.HashSet;

public class CommonEleFromTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60, 70};
        
        HashSet<Integer> set=new HashSet<Integer>();
        HashSet<Integer> common=new HashSet<Integer>();
        
        for(int num:arr1)
        {
        	set.add(num);
        }
        
        for(int num:arr2)
        {
        	if(set.contains(num))
				{
						common.add(num);
				}
        }
        
        System.out.println(common);
	}

}
