package CollectionExample;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

    public static void main(String args[]) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 2, 6, 9);

        nums.forEach(n -> System.out.println(n));

        // int sum = 0;

        // for (int i : nums) {

        // if (i % 2 == 0) {

        // i = i * 2;
        // sum = sum + i;
        // }

        // }

        // System.out.println(sum);

    }
}
