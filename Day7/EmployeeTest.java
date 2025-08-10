///*3. Create a Java application to manage employees in a company. Define an abstract class Employee with a methodcalculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different typesof employees using the Employee reference.*/

abstract class Employee
{
	protected String name;
	protected int id;

	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	abstract void methodcalculateSalary();
}

class FullTimeEmployee extends Employee
{
	double monthlySalary;

	FullTimeEmployee(String name, int id,double monthlySalary)
	{
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	public void methodcalculateSalary()
	{
		System.out.println("Full time employee name : "+ name + " and Id is "+ id);
		System.out.println("Salary is : " + monthlySalary);
	}
}

class PartTimeEmployee extends Employee
{
	int noOfHours;
	double salary;

	PartTimeEmployee(String name, int id,int noOfHours,double salary )
	{
		super(name, id);
		this.noOfHours = noOfHours;
		this.salary = salary;
	}
	public void methodcalculateSalary()
	{
		System.out.println("Full time employee name : "+ name + " and Id is "+ id);
		System.out.println(noOfHours * salary);
	}
}

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee emp1 = new FullTimeEmployee("Akshayaa", 101, 50000);
		emp1.methodcalculateSalary();

		Employee emp2 = new PartTimeEmployee("Abinaya", 102, 10, 1000);
		emp2.methodcalculateSalary();
	}
}