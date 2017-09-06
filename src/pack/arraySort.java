package pack;

import java.util.*;

public class arraySort {
	public static void main(String[] args) {
		int []abc = new int[]{5,4,3,2,1};
		String []xyz = new String[]{"shivam","chaube","niit"};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(xyz));
		Arrays.sort(abc);
		Arrays.sort(xyz);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(xyz)); //String Array sorting is case sensitive 
															//because it is sorted based on the unicode of the character
	}
}
