package pack;

public class findDuplicate {
	public static void main(String[] args) {
		int[] abc = new int[] { 10, 20, 20, 40, 50, 60 };
		int count = 0;
		for (int i = 0; i < abc.length; i++) {
			for (int j = i + 1; j < abc.length; j++) {
				if (abc[i] == abc[j]) {
					count++;
				}
			}
		}
		System.out.println("count is : " + count);
	}
}
