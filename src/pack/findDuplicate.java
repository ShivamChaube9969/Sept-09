package pack;

public class findDuplicate {
	public static void main(String[] args) {
		int[] abc = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 10 };
		int count = 1;
		first: for (int i = 0; i < abc.length - 1; i++) {

			for (int k = i - 1; k >= 0; k--) {
				if (abc[i] == abc[k])
					continue first;
			}
			for (int j = i + 1; j < abc.length; j++) {
				if (abc[i] == abc[j]) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(abc[i] + " is repeated " + count + " times");
			count = 1;
		}
	}
}
