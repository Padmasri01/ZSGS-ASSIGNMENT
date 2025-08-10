import java.util.Comparator;
import java.util.TreeMap;

/*6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map
 */

import java.util.TreeMap;

public class TreeMapTest  {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(101, "Akshayaa");
        treeMap.put(102, "Abinaya");
        treeMap.put(103, "Vasunthra");
        treeMap.put(104,"Priya");
        System.out.println(treeMap);

        System.out.println("Coping a Tree Map content to another Tree Map.");
        TreeMap<Integer,String> treeMap1 = new TreeMap<>(treeMap);
        System.out.println("Copied tree map: " + treeMap1);

        System.out.println("Search a key in a Tree Map.");
        System.out.println(treeMap.containsKey(103));

        System.out.println("Search a value in a Tree Map.");
        System.out.println(treeMap.containsValue("Akshayaa"));

        System.out.println("Delete all elements from a given Tree Map.");
        treeMap1.clear();
        System.out.println(treeMap1);

        System.out.println("Sort keys in Tree Map by using comparator");
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
        treeMap2.put(101, "Akshayaa");
        treeMap2.put(102, "Abinaya");
        treeMap2.put(103, "Vasunthra");
        treeMap2.put(104,"Priya");
        System.out.println(treeMap2);

        System.out.println("Get a key-value mapping associated with the greatest key and the least key in a map.");
        System.out.println("First entry: "+treeMap.firstEntry());
        System.out.println("Last entry: "+treeMap.lastEntry());

        System.out.println("Get the first (lowest) key and the last (highest) key currently in a map.");
        System.out.println("First key: "+ treeMap.firstKey());
        System.out.println("Last key: "+ treeMap.lastKey());

        System.out.println("Reversed tree map: "+ treeMap.reversed());



    }
}
