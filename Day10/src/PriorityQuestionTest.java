/*5. Write a Java program to,
        1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        2. iterate through all elements in the priority queue.
        3. add all the elements of a priority queue to another priority queue.
        4. insert a given element into a priority queue.
        5. remove all the elements from a priority queue.
        6. count the number of elements in a priority queue.
7. compare two priority queues.
        8. retrieve the first element of the priority queue.
        9. retrieve and remove the first element.
        10. convert a priority queue to an array containing all of the elements of the queue*/


import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQuestionTest {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Blue");
        priorityQueue.add("Black");
        priorityQueue.add("White");
        priorityQueue.add("Green");
        priorityQueue.add("Orange");
        System.out.println(priorityQueue);

        System.out.println("Iterating the elements:");
        Iterator it = priorityQueue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Adding all the elements of a priority queue to another priority queue.");
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.addAll(priorityQueue);
        System.out.println(priorityQueue1);

        System.out.println("Insert a given element into a priority queue.");
        priorityQueue.add("Purple");
        System.out.println(priorityQueue);

        System.out.println("Remove all the elements from a priority queue.");
        priorityQueue1.clear();
        System.out.println(priorityQueue1);

        System.out.println("Size of the priority Queue:" + priorityQueue.size());

        System.out.println("Comparing two priority queue:");
        System.out.println(priorityQueue.equals(priorityQueue1));

        System.out.println("First element in the queue:" + priorityQueue.peek());

        System.out.println("Retrive and remove the first element: " + priorityQueue.poll());

        System.out.println("Convert a priority queue to an array containing all of the elements of the queue.");

        String[] priorityarray = priorityQueue.toArray(new String[0]);
        System.out.println(Arrays.toString(priorityarray));
    }
}
