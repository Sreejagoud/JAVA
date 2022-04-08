package staticproject;
	class Addition{
		static int i;
		static int k;
		static int s;
		int m,n,s1;
		Addition(int p, int q){
			m=p;
			n=q;
		}
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
		void nonStaticAddition1() {
			s1=m+n;
			System.out.println("sum non static="+s1);
		}
	}
	public class StaticMain {

		public static void main(String[] args) {
			//static variables and methods can be accessed with reference to class
			 //Object creation is not required
			//static information belongs to class
			Addition.add(); //static method
			Addition ob=new Addition(3,5);
			Addition ob1=new Addition(6,5);
		   ob.nonStaticAddition1();
		   ob1.nonStaticAddition1();
		}
}
