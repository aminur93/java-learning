package CollectionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo5 {

    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2, 6, 9);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (a, b) -> a + b);

        // Predicate<Integer> p = n -> n % 2 == 0;

        // Function<Integer, Integer> f = n -> n * 2;

        // int result = nums.stream()
        // .filter(p)
        // .map(f)
        // .reduce(0, (a, b) -> a + b);

        Stream<Integer> s1 = nums.stream().filter(n -> n % 2 == 0).sorted();

        s1.forEach(n -> System.out.println(n));

        // System.out.println(result);

        // s3.forEach(n -> System.out.println(n));
    }
}
