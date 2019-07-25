package collectionTest;

public class Employee implements Comparable<Employee> {
	
	
	
	private int empId;
	private String empName;
	private int age;
	
	
	

	public Employee(int empId, String empName, int age) {
	//	super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public int getEmpId() {
		return empId;
	}

	public String toString() {
		return "\nname :"+ empName +"\nEMpID :"+empId +" \nAge"+age;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return age-o.age;
	}
	
	public String getName() {
		return empName;
	}

}
