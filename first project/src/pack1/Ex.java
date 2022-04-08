package pack1;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,2,4,1,3};
		for(int i = 0; i < a.length; i++){
		    a[i] = a[(a[i] + 3) % a.length];
		}
	}

}
