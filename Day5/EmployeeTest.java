/*3. Create a Java application to manage employees in a company. Define a base class Employee with a methodcalculateSalary(). Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that override calculateSalary() method based on their working type.*/

import java.util.Scanner;

abstract class Employee
{
	String name;
	int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	abstract double methodcalculateSalary();
	
	void display()
	{
		System.out.println("Name: " + name + ", ID: " + id + ", Salary:  " + methodcalculateSalary());
	}
}

class FullTimeEmployee extends Employee
{
	double monthlySalary;

	FullTimeEmployee(String name, int id, double monthlySalary)
	{
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	public double methodcalculateSalary()
	{
		return monthlySalary;
	}
}

class PartTimeEmployee  extends Employee
{
	int hoursWorked;
	double hourlyRate;

	PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate)
	{
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public double methodcalculateSalary()
	{
		return hoursWorked * hourlyRate;
	}
}

class ContractEmployee extends Employee
{
	double contractAmount;
	int months;
	
	ContractEmployee(String name, int id, double contractAmount, int months)
	{
		super(name, id);
		this.contractAmount = contractAmount;
		this.months = months;
	}

	public double methodcalculateSalary()
	{
		return contractAmount/months;
	}
}

class EmployeeTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Employee[] emp = new Employee[3];

		emp[0] = new FullTimeEmployee("Akshayaa" , 101, 50000 );
		emp[1] = new PartTimeEmployee("Abinaya" , 102, 60, 300 );
		emp[2] = new ContractEmployee("Vasunthra" , 103, 12000,6);

		System.out.println("\n-------------Employee Details----------------");
		for(Employee e : emp)
		{
			e.display();
		}
	
		sc.close();

	}
}