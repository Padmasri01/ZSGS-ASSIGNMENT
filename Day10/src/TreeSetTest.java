/*4. Write a Java program to,
a. create a new tree set, add some colors (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.*/

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("Creating a new tree set, add some colors (string) and print out the tree set.");
        treeSet.add("Green");
        treeSet.add("Blue");
        treeSet.add("Black");
        treeSet.add("White");
        System.out.println(treeSet);

        System.out.println("Iterating the elements:");
        Iterator it = treeSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Adding all the elements of a specified tree set to another tree set.");
        TreeSet<String > treeSet1 = new TreeSet<>();
        treeSet1.addAll(treeSet);
        System.out.println("New tree set: " + treeSet1);

        System.out.println("Reversing given tree set");
        System.out.println(treeSet.reversed());


        System.out.println("Getting the first and last elements in a tree set");
        System.out.println("First Element: " + treeSet.getFirst());
        System.out.println("Last Element: " + treeSet.getLast());

        System.out.println("Cloning a tree set list to another tree set.");
        TreeSet<String> treeSet2 = new TreeSet<>(treeSet);
        System.out.println(treeSet2);

        System.out.println("Size of the tree set: " + treeSet.size());

        System.out.println();

        System.out.println("Finding the numbers less than 7 in a tree set.");
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(5);
        integerTreeSet.add(7);
        integerTreeSet.add(0);
        integerTreeSet.add(10);
        integerTreeSet.add(9);
        System.out.println(integerTreeSet.headSet(7));

        System.out.println("Getting the element in a tree set which is greater than or equal to the given element.");
        System.out.println(integerTreeSet.ceiling(8));

        System.out.println("Getting the element in a tree set which is less than or equal to the given element.");
        System.out.println(integerTreeSet.floor(5));

        System.out.println("Getting the element in a tree set which is strictly greater than  the given element.");
        System.out.println(integerTreeSet.higher(10));

        System.out.println("Getting the element in a tree set which is strictly less than the given element.");
        System.out.println(integerTreeSet.lower(10));

        System.out.println(" Retrieve and remove the first element of a tree set.");
        System.out.println(integerTreeSet.pollFirst());

        System.out.println("Retrieve and remove the last element of a tree set.");
        System.out.println(integerTreeSet.pollLast());

        System.out.println("Remove a given element from a tree set.");
        System.out.println(integerTreeSet.remove(7));
    }
}
