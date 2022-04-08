package staticproject;


	class Addition1{
		static int i;
		static int k;
		static int s;
		static {
			//static block is used to initialize static data
			i=9;
			k=10;
		}
		static void add() {
			//static method can access only static data
			//static method belongs to class
			s=i+k;
			System.out.println("sum="+s);
		}
		
		
	}
	public class StaticMethod {

		public static void main(String[] args) {
			//static variables and methods can be accessed with reference to class
			 //Object creation is not required
			//static information belongs to class
			Addition.add(); //static method
		}

	}
