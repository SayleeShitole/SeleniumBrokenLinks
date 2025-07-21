package extraprogrammes;

import java.util.HashSet;

public class PairsInArrays {

	//Find Pairs in Array Whose Sum Equals a Target
	public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, -1, 7, 8};
        int target = 7;

        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum " + target + ":");

        for (int num : arr) {
            int complement = target - num;
            System.out.println(complement);
            //System.out.println(set.contains(complement));
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }

            set.add(num);
        }
    }

}
