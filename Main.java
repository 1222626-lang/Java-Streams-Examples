import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        // Filter: print even numbers
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Sort numbers
        // List<Integer> sortedResult = numbers.stream()
        //         .sorted()
        //         .toList();
        // System.out.println(sortedResult);

        // Remove duplicates
        // List<Integer> distinctResult = numbers.stream()
        //         .distinct()
        //         .toList();
        // System.out.println(distinctResult);

        // Count even numbers
        // long count = numbers.stream()
        //         .filter(n -> n % 2 == 0)
        //         .count();
        // System.out.println("Even count: " + count);

        // Calculate sum
        // int sum = numbers.stream()
        //         .mapToInt(Integer::intValue)
        //         .sum();
        // System.out.println("Sum: " + sum);
    }
}