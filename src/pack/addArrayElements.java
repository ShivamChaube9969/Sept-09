package pack;

public class addArrayElements {

	public static void main(String[] args) {
		int []abc = new int[]{10,20,30,40,100};
		int res = 0;
		for(int i = 0; i < abc.length; i++){
			res += abc[i];
		}
		System.out.println(res);
	}

}
