/*3. Design a class Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.*/

class Employee 
{
    	private int employeeID;
    	private String name;
    	private String designation;
    	private String department;
    	private double monthlySalary;

    
    	public Employee(int employeeID, String name, String designation, String department, double monthlySalary) 
	    {
        	this.employeeID = employeeID;
        	this.name = name;
        	this.designation = designation;
        	this.department = department;
        	this.monthlySalary = monthlySalary;
    	}

        public int getEmployeeID() 
	    {
        	return employeeID;
    	}

    	public void setEmployeeID(int employeeID) 
	    {
        	this.employeeID = employeeID;
    	}

    	public String getName() 
	    {
        	return name;
    	}

    	public void setName(String name) 
	    {
        	this.name = name;
    	}

    	public String getDesignation() 
	    {
        	return designation;
    	}

    	public void setDesignation(String designation)
	    {
        	this.designation = designation;
    	}

    	public String getDepartment() 
	    {
        	return department;
    	}

    	public void setDepartment(String department) 
	    {
        	this.department = department;
    	}

   	    public double getMonthlySalary()
	    {
        	return monthlySalary;
    	}

    	public void setMonthlySalary(double monthlySalary) 
	    {
        	if (monthlySalary > 0) 
		    {
            		this.monthlySalary = monthlySalary;
        	}
    	}

    
    	public double getAnnualSalary() 
	    {
        	return monthlySalary * 12;
    	}
}


public class EmployeeTest
{
    	public static void main(String[] args) 
	    {
                Employee emp = new Employee(101, "Akshayaa", "Software Engineer", "IT", 50000);

                emp.setMonthlySalary(55000);
 
                System.out.println("Employee ID   : " + emp.getEmployeeID());
        	System.out.println("Name          : " + emp.getName());
        	System.out.println("Designation   : " + emp.getDesignation());
        	System.out.println("Department    : " + emp.getDepartment());
        	System.out.println("Monthly Salary: " + emp.getMonthlySalary());
        	System.out.println("Annual Salary : " + emp.getAnnualSalary());
    	}
}


