package list;

	import java.util.ArrayList;
	import java.util.Iterator;

	class Student{
		int sid;
		String sname;
		float fees;
		public Student(int sid, String sname, float fees) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
		}	
	}
	public class StudentArray {

		public static void main(String[] args) {
			Student s1=new Student(1, "Kiran", 6543.2f);
			Student s2=new Student(2, "Lokeshwari", 7543.2f);
			Student s3=new Student(3, "Pavithra", 89321.2f);
			
			ArrayList<Student> slist=new ArrayList<Student>();
			slist.add(s1);
			slist.add(s2);
			slist.add(s3);
			System.out.println(slist);
			
			//Iterator 
			Iterator<Student> sit=slist.iterator();
			while(sit.hasNext()) {
			Student sob=sit.next();
			System.out.println(sob.sid+" "+sob.sname+" "+sob.fees);
			}
		}
	}