/*5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.*/


class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student3 implements Cloneable {
    String name;
    int age;
    Address address;

    Student3(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + address.city);
    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Chennai");
        Student3 s1 = new Student3("Arun", 21, addr);

        // Clone s1 to s2
        Student3 s2 = (Student3) s1.clone();

        System.out.println("Before changing s1's city:");
        s1.display();
        s2.display();

        // Change the city in s1
        s1.address.city = "Coimbatore";

        System.out.println("\nAfter changing s1's city:");
        s1.display();
        s2.display();
    }
}
