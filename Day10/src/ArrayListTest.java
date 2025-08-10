import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
* a. to create a new array list, add some colors (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list. */
public class ArrayListTest {

    public static void main(String[] args)
    {
        ArrayList<String> colors=new ArrayList<>();
        ArrayList<String> clr= colors;//new ArrayList<>();
        colors.add("Black");
        colors.add("pink");
        colors.add("green");
        colors.add("white");
        colors.add("white");
        colors.add("Red");
        colors.add("yellow");

        System.out.println(colors);

        System.out.println("Using iterator:");
        Iterator it=colors.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        colors.addFirst("Green");
        System.out.println("Adding first element: " + colors);
        System.out.println("Getting third element: "+colors.get(3));

        colors.set(4,"Blue");
        System.out.println("set color:"+colors);


        colors.remove(2);
        System.out.println("After removing element: "+colors);

        System.out.println("Checking specific color: "+colors.contains("pink"));


        Collections.sort(colors);
        System.out.println("After sorting: "+colors);


        System.out.println(clr);

        Collections.shuffle(colors);

        System.out.println("After shuffling: "+colors);
    }
}