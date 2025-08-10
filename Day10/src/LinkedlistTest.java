/*2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list*/

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistTest {
    public static void main(String[] args) {
        LinkedList<Integer> linklst = new LinkedList<>();

        linklst.add(100);
        linklst.add(200);
        linklst.add(500);
        linklst.add(300);
        linklst.add(400);
        System.out.println("Original linked list: "+linklst);

        linklst.addLast(600);
        System.out.println("After adding element to the last position: " + linklst);

        System.out.println("Iterating elements:");
        Iterator it = linklst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Iterating elements from specific position:");
        Iterator it2 = linklst.listIterator(2);
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("Iterating elements in reverse order:");
        Iterator it3 = linklst.descendingIterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }

        System.out.println("Inserting the specified element at the specified position in the linked list");
        linklst.add(4,800);
        System.out.println(linklst);

        System.out.println("Inserting elements into the linked list at the first and last position.");
        linklst.addFirst(1000);
        linklst.addLast(2000);
        System.out.println(linklst);

        System.out.println("Inserting the specified element at the front of a linked list.");
        linklst.addLast(300);
        System.out.println(linklst);

        System.out.println("Inserting the specified element at the end of a linked list.");
        linklst.addLast(200);
        System.out.println(linklst);

        System.out.println("Inserting some elements at the specified position into a linked list.");
        linklst.add(3,600);
        linklst.add(4,700);
        linklst.add(5,800);
        System.out.println(linklst);


        System.out.println("Get the first and last occurrence of the specified elements in a linked list:");
        System.out.println("First Occurence: " + linklst.indexOf(300));
        System.out.println("Last Occurence: " +linklst.lastIndexOf(300));
    }
}
