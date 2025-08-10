/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/
class Employee2
{
	String name;
	int yearOfJoining;
	double salary;
	String address;
	Employee2(String name, int yearOfJoining, double salary, String address)
	{
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}
	public static void main(String[] args)
	{
		Employee2 emp1 = new Employee2("Robert", 1994, 10000, "64C- WallsStreet");
		Employee2 emp2 = new Employee2("Sam", 2000, 10000, "68DC- WallsStreet");
		Employee2 emp3 = new Employee2("John", 1999, 10000, "26B- WallsStreet");
		System.out.format("%-10s %-15s %-10s%n", "Name", "Year of Joining", "Address");
		System.out.format("%-10s %-15d %-10s%n", emp1.name, emp1.yearOfJoining, emp1.address);
		System.out.format("%-10s %-15d %-10s%n", emp2.name, emp2.yearOfJoining, emp2.address);
		System.out.format("%-10s %-15d %-10s%n", emp3.name, emp3.yearOfJoining, emp3.address);		
	}
}