/*7. Develop a Java program to illustrate the usage of toString() method*/
class Student4 {
    String name;
    int age;
    int marks;


    Student4(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age + ", Marks: " + marks;
    }
}

public class ToStringEg {
    public static void main(String[] args) {

        Student4 s1 = new Student4("Arun", 20, 85);
        Student4 s2 = new Student4("Bala", 21, 90);


        System.out.println(s1);
        System.out.println(s2);
    }
}

