/*3. Develop a Java program which illustrates the usage of Comparable Interface.*/

import java.util.*;

class Student1 implements Comparable<Student1> {
    String name;
    int age;
    int marks;

    Student1(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int compareTo(Student1 other) {
        return this.marks - other.marks;
    }


    public String toString() {
        return name + " - Age: " + age + ", Marks: " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Aruna", 20, 85));
        students.add(new Student1("Devi", 22, 75));
        students.add(new Student1("Priya", 19, 90));


        System.out.println("Original List:");
        for (Student1 s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nSorted by Marks (Ascending):");
        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}
