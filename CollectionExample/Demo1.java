package CollectionExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    
    public static void main(String args[])
    {
        //Set<Integer> nums = new HashSet<Integer>(); // this hashset does not sort the array elements

        //Set<Integer> nums = new TreeSet<Integer>(); // this treeset sorted the array elemenrs in ascending order

        Collection<Integer> nums = new TreeSet<Integer>(); // collection is also use treeset and hashset

        nums.add(145);
        nums.add(25);
        nums.add(35);
        nums.add(49);
        nums.add(5);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
    }
}
