/*2. Develop a Java program that illustrates the usage of the Comparator Interface.
 */

import java.util.*;

class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return name + " - Age: " + age + ", Marks: " + marks;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add some students
        students.add(new Student("Elakiya", 20, 85));
        students.add(new Student("Subha", 22, 75));
        students.add(new Student("Dharshini", 19, 90));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }


        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }


        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by Marks (High to Low):");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by Age:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}



