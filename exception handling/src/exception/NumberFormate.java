package exception;

public class NumberFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println("Beefore paresInt");
		try {
			int i=Integer.parseInt(s);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
			System.out.println("After paresInt");
	}

}
