package maps;

	import java.util.HashMap;
	import java.util.Map;

	class Student1 {
		String name;
		int sid;
		float sfees;
		public Student1(String name, int sid, float sfees) {
			super();
			this.name = name;
			this.sid = sid;
			this.sfees = sfees;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", sid=" + sid + ", sfees=" + sfees
					+ "]";
		}
		public float getSfees() {
			return sfees;
		}
		public void setSfees(float sfees) {
			this.sfees = sfees;
		}
		
	}
	public class HashMapStudent {

		
		public static void main(String[] args) {
			HashMap<Integer,Student> ob=new HashMap<Integer, Student>();
			Student s1=new Student("sreeja",12,134f);
			Student s2=new Student("srivani",13 ,1344f);
			Student s3=new Student("madhu",14,134f);
			ob.put(1, s1);
			ob.put(2, s2);
			ob.put(3, s3);
			System.out.println(ob);
			for(Map.Entry<Integer,Student>m:ob.entrySet()){
				int k=m.getKey();
				Student b=m.getValue();
				System.out.println(b.getName()+" "+b.getSid()+" "+b.getSfees());
			}
		}
}
