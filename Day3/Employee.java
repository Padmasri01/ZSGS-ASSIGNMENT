/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s
name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default
values for all the fields.
b. Write a parameterized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with
the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parameterized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees*/


class Employee
{
	String name;
	int empID;
	String designation;
	double salary;
	//the object has been created, and sets default values for all the fields.
	Employee()
	{
		System.out.println("Object has been created");
	}
	 //parametrized constructor that allows us to set values for all the fields when an object is created.
	Employee(String name, int empID, String designation, double salary)
	{
		this.name = name;
		this.empID = empID;
		this.designation = designation;
		this.salary = salary;
	}
	// a copy constructor — that takes an existing employee object and creates a new one with the same values.
	Employee(Employee emp)
	{
		this.name = emp.name;
		this.empID = emp.empID;
		this.designation = emp.designation;
		this.salary = emp.salary;
	}
	//display the details of employees
	public void display()
	{
		System.out.println("Name: " + name +"\n"+ "Employee Id: " + empID +"\n"+ "Designation: " + designation +"\n"+ "Salary: " + salary +"\n");
	}
	public static void main(String[] args)
	{
		//object using the no-argument constructor
		Employee obj1 = new Employee();
		//object using the parametrized constructor
		Employee obj2 = new Employee("Alice", 1001, "Manager", 50000);
		//Object using the copy constructor.
		Employee obj3 = new Employee(obj1);
		obj1.display();
		obj2.display();
		obj3.display();
	}
	



	
}