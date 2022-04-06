package arraylist;

	import java.util.ArrayList;
	import java.util.Iterator;

	class Employee{
		int eid;
		String ename;
		float salary;
		String desg;
		public Employee(int eid, String ename, float salary, String desg) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
			this.desg = desg;
			}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
	}

	public class MyArrayListEmployee {
		
	       public static void main(String[] args) {
			ArrayList<Employee> eit=new ArrayList<>();
			Employee eob=new Employee(1,"sreeja",10000f,"MD");
			Employee eob1=new Employee(2,"Akhil",20000f,"Manager");
			Employee eob2=new Employee(3,"Pallavi",30000f,"officer");	
			ArrayList<Employee> ob = null;
			ob.add(eob);
			ob.add(eob1);
			ob.add(eob2);
			Iterator sit=ob.iterator();
			while(sit.hasNext()) {
		     Student s=(Student) sit.next();
			System.out.println(s.sid +" "+s.name+" "+s.fees);
			}
	       }
}
