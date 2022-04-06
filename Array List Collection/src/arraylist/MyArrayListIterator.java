package arraylist;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.ListIterator;

	class Student{
		int sid;
		String name;
		float fees;
		public Student(int sid, String name, float fees) {
			super();
			this.sid = sid;
			this.name = name;
			this.fees = fees;
		}
		
	}

	public class MyArrayListIterator {

		public static void main(String[] args) {
		ArrayList<Student> ob=new ArrayList<>();
		Student sob1=new Student(1,"Akshay",8976.45f );
		Student sob2=new Student(2,"Monika",8966.45f );
		Student sob3=new Student(3,"Suma",8266.45f );
		ob.add(sob1);
		ob.add(sob2);
		ob.add(sob3);
		
		//Fetch data from List
		Iterator sit=ob.iterator();
		while(sit.hasNext()) {
	     Student s=(Student) sit.next();
		System.out.println(s.sid +" "+s.name+" "+s.fees);
		}
	    }
	}

