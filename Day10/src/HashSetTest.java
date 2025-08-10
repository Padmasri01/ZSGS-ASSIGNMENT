/*3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set. */

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();


        hashSet.add('H');
        hashSet.add('e');
        hashSet.add('l');
        hashSet.add('l');
        hashSet.add('O');
        hashSet.add('x');

        System.out.println("Original Hash set: " + hashSet);

        System.out.println("Append the specified element to the end of a hash set.");
        hashSet.add('p');
        System.out.println(hashSet);

        System.out.println("Iterate through all elements in a hash list.");
        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Number of elements in the hash set is "+ hashSet.size());

        HashSet<Character> hashSet1 = new HashSet<>(hashSet);
        System.out.println("Cloning the hash set: "+ hashSet1);

//        System.out.println("Empty the hash set: " );
//         hashSet.clear();
//        System.out.println(hashSet);
//
//        System.out.println("Hash set is empty or not: "+hashSet.isEmpty());

        System.out.println("Converting a hash set to an array");
        Character[] hashArr = hashSet1.toArray(new Character[hashSet1.size()]);
        System.out.println(Arrays.toString(hashArr));

        System.out.println("Converting hash set to tree set:");
        TreeSet<Character> treeSet = new TreeSet<>(hashSet1);
        System.out.println("Tree Set: " + treeSet);

        System.out.println("Converting hash set to Array List:");
        ArrayList<Character> arrayList = new ArrayList<>(hashSet1);
        System.out.println("Array List : " + arrayList);

        System.out.println("Comparing two hash set.");
        System.out.println(hashSet.equals(hashSet1));


    }
}
