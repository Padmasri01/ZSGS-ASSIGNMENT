/*7. Write a Java program to,
        1. associate the specified value with the specified key in a HashMap.
        2. count the number of key-value (size) mappings in a map.
        3. copy all of the mappings from the specified map to another map.
        4. remove all of the mappings from a map.
        5. check whether a map contains key-value mappings (empty) or not.
        6. get a shallow copy of a HashMap instance.
        7. test if a map contains a mapping for the specified key.
        8. test if a map contains a mapping for the specified value.
        9. create a set view of the mappings contained in a map.
        10. get the value of a specified key in a map.*/


import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(101,"Akshayaa");
        hashMap.put(102,"Abinaya");
        hashMap.put(103,"Vasunthra");
        hashMap.put(104,"Priya");
        System.out.println(hashMap);

        System.out.println("Hashmap size: "+ hashMap.size());

        HashMap<Integer,String> hashMap1 = new HashMap<>(hashMap);
        System.out.println("Cloned map: " + hashMap1);

        hashMap1.clear();
        System.out.println(hashMap1);

        System.out.println("Checking whether a map contains key-value mappings (empty) or not.");
        System.out.println(hashMap.isEmpty());

        HashMap<Integer, String> hashMap2 = (HashMap<Integer, String>) hashMap.clone();
        System.out.println(hashMap2);

        System.out.println("Checks if the map contains the key: "+ hashMap.containsKey(103));

        System.out.println("Checks if the map contains the value: "+ hashMap.containsValue("Vasunthra"));

        System.out.println("create a set view of the mappings contained in a map.");
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);

        System.out.println("Get key:"+ hashMap.get(104));
    }
}
