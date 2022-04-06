package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
  
class Employee {

	int emp_id;
	String emp_name;
	String emp_dept;
	float emp_sal;
	public Employee(int emp_id, String emp_name,String emp_dept, float emp_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dept=emp_dept;
		this.emp_sal = emp_sal;
	}
	public String toString() {
		return "Employee [emp_id" + emp_id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + ",emp_sal=" + emp_sal + "]";
	}	
public class EmployeeSort{
	public static void main (String args[]) {
		Employee emp1=new Employee(1,"sreeja","Manager",70000.0f);
		Employee emp2=new Employee(2,"srivani","HR",80000.0f);
		Employee emp3=new Employee(3,"siri","Software developer",60000.0f);
		Vector<Employee> eob=new Vector<Employee>();
		eob.add(emp1);
		eob.add(emp2);
		eob.add(emp3);
		
			
		
	}
	}
}
