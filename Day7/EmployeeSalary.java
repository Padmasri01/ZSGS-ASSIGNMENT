/*4. Create a Java application to manage employees in a company. Define an Interface Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types
of employees using the Employee reference.
*/
interface Emp{
    void calculateSalary();
}

// Full-time employee class
class FulltTimeEmployee implements Emp {
    int monthlySalary;

    FulltTimeEmployee(int salary) {
        this.monthlySalary = salary;
    }

    public void calculateSalary() {
        System.out.println("Full-time employee salary: ₹" + monthlySalary);
    }
}

// Part-time employee class
class ParttTimeEmployee implements Emp {
    int hoursWorked;
    int hourlyRate;

    ParttTimeEmployee(int hours, int rate) {
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Part-time employee salary: ₹" + salary);
    }
}

// Main class to test
public class EmployeeSalary {
    public static void main(String[] args) {


        Emp e1 = new FulltTimeEmployee(40000);
        Emp e2 = new ParttTimeEmployee(100, 200);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
