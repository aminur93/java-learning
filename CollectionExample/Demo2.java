package CollectionExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo2 {

    public static void main(String args[]) {

        // Map<String, Integer> Students = new HashMap<>();

        Map<String, Integer> Students = new Hashtable<>();

        Students.put("John", 90);
        Students.put("Mike", 80);
        Students.put("Tom", 85);
        Students.put("John", 95);

        System.out.println(Students);

        System.out.println(Students.get("John"));

        System.out.println(Students.keySet());

        for (String key : Students.keySet()) {
            System.out.println(key + " : " + Students.get(key));
        }
    }
}
