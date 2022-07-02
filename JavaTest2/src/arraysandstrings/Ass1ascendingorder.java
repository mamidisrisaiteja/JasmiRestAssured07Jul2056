//import java.util.Arrays;
package arraysandstrings;

import java.util.Arrays;

public class Ass1ascendingorder {

	public static void main(String[] args) {
		int arr1[]= {3,314,17,5};
		//invoking sort() method of the Arrays class  
		Arrays.sort(arr1);   
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
	}

}
