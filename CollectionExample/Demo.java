package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.get(2));

        System.out.println(nums.size());

        nums.remove(2);

        // for(int num : nums)
        // {
        //     System.out.println(num);
        // }
    }
}
