package inheritance;

class one{
	one(){
		System.out.println("one constructor");
	}
}
class two extends one{
	two(){
		System.out.println("two constructor");
	}
}
class three extends one{
	three(){
		System.out.println("three constructor");
	}
}
class four extends one{
	four(){
		System.out.println("four constructor");
	}
}
public class Constructor {

	public static void main(String[] args) {
		four ob=new four();
	}

}
