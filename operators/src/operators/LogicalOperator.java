package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		i=9;
		j=2;
		int p;
		p= (i<j)?i:j;
		System.out.println("print the laregest of "+i+" and " +j+ " is " +p);
		int s=(i<j)?i:j;
		System.out.println("print the smallest of "+i+" and "+j+" is "+s);
		
		int m=9 , n=7, l=4;
		int lar=(m>n && m>l)?m:(n>m && n>l)?n:l;
		System.out.println("largest of 3 no is " +lar);
		
		
	}

}
