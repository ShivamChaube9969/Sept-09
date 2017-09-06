package pack;

import java.util.Arrays;

public class arrayRev {

	public static void main(String[] args) {
		int[] abc = new int[] { 10, 20, 30, 40, 50, 60};
		int j = abc.length - 1;
		System.out.println("Array before reversing" + Arrays.toString(abc));
		for (int i = 0; i < abc.length/2; i++) {
			abc[i] = abc[i] + abc[j];
			abc[j] = abc[i] - abc[j];
			abc[i] = abc[i] - abc[j];
			j--;
 		}
		System.out.println("Array after reversing " + Arrays.toString(abc));
	}

}
