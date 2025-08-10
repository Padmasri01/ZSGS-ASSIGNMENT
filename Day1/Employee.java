class Employee{
	int empId;
	String empName;
	String department;
	double salary;
	Employee(int empId, String empName, String department, float salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary; 
	}
	public void display(){
		System.out.println("Employee ID: " + empId);
        	System.out.println("Name: " + empName);
        	System.out.println("Department: " + department);
        	System.out.println("Salary: " + salary);	
	}
	public static void main(String[] args){
		Employee emp = new Employee(1001, "Sri", "IT", 30000);
		emp.display();
	}
}