package pack;

import java.util.Arrays;
import java.util.Scanner;

public class removeSpecificElement {
	public static void main(String[] args) {
		int[] abc = new int[] { 10, 20, 3, 4, 50 };
		System.out.println("Orignal Array " + Arrays.toString(abc));
		Scanner in = new Scanner(System.in);
		int i = 0;
		while (i != 1) {
			System.out.println("Enter the element you want to remove : ");
			int index = in.nextInt();
			if (index < abc.length - 1 && index > 0) {
				abc[index] = 0;
				System.out.println("New Arrays is " + Arrays.toString(abc));
				i++;
			} else {
				System.out.println("Enter valid index for given array");
			}
		}
		in.close();
	}
}
