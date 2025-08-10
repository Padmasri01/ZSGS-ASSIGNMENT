/*8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid
CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable*/

class Student5 implements Cloneable {
    String name;
    int rollNo;
    String department;

    Student5(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Dept: " + department;
    }

    // Cloning method
    public Student5 clone() throws CloneNotSupportedException {
        return (Student5) super.clone(); // This will throw exception if Cloneable not implemented
    }
}

public class CloneExample2 {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Arun", 101, "CSE");

        try {
            Student5 s2 = s1.clone(); // Try to clone
            System.out.println("Original: " + s1);
            System.out.println("Cloned:   " + s2);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException: Class must implement Cloneable");
        }
    }
}

/*  To avoid CloneNotSupportedException in Java, the class must implement the Cloneable interface.
    This is because the clone() method is defined in the Object class, and when it's called, it checks whether the current object’s class implements the Cloneable interface.
    If it doesn't, the clone() method throws a CloneNotSupportedException at runtime.
    Cloneable is a marker interface, meaning it doesn’t contain any methods. Its purpose is simply to mark that a class allows cloning.
    By implementing Cloneable, we tell the JVM that it is safe to create a field-for-field copy of the object using super.clone().
    Therefore, to avoid runtime errors and enable object cloning, the class must implement the Cloneable interface.*/


