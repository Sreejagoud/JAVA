package String;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b=new StringBuffer("Hello");
		b.insert(2, "India");
		System.out.println("After insert "+b);
		
		//append
		b.append("Hi");
		System.out.println("After append "+b);
		//reverse
		b.reverse();
		System.out.println("After reverse "+b);
		//replace
		b.replace(3,4, "How are you?");
		System.out.println("After replace "+b);
		//delete
		b.delete(2,5);
		System.out.println("after delete "+b);
		//particular character to delete
		b.deleteCharAt(5);
		System.out.println(b);
	}
}
