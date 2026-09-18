package streams_new;

import java.util.*;
import java.util.stream.*;

/**
 * This class demonstrates the most commonly used Stream functions in Java
 */
public class StreamFunctions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = List.of("apple", "banana", "cherry", "date", "elderberry");
        
        System.out.println("=== COMMONLY USED STREAM FUNCTIONS ===\n");
        
        // 1. filter() - filters elements based on a condition
        System.out.println("1. filter() - Get even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        
        // 2. map() - transforms each element
        System.out.println("\n2. map() - Square each number:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
        
        // 3. collect() - collects elements into a collection
        System.out.println("\n3. collect() - Collect to List:");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        // 4. forEach() - performs action on each element
        System.out.println("\n4. forEach() - Print all strings:");
        strings.stream()
                .forEach(System.out::println);
        
        // 5. reduce() - combines elements into a single value
        System.out.println("\n5. reduce() - Sum of all numbers:");
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
        // 6. count() - counts elements
        System.out.println("\n6. count() - Count of numbers > 5:");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Count: " + count);
        
        // 7. sorted() - sorts elements
        System.out.println("\n7. sorted() - Sorted strings:");
        strings.stream()
                .sorted()
                .forEach(System.out::println);
        
        // 8. distinct() - removes duplicate elements
        System.out.println("\n8. distinct() - Distinct numbers:");
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5);
        numbersWithDuplicates.stream()
                .distinct()
                .forEach(System.out::println);
        
        // 9. limit() - limits the number of elements
        System.out.println("\n9. limit() - First 5 numbers:");
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);
        
        // 10. skip() - skips first n elements
        System.out.println("\n10. skip() - Skip first 3 numbers:");
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
        
        // 11. findFirst() - gets first element
        System.out.println("\n11. findFirst() - First even number:");
        Optional<Integer> first = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }
        
        // 12. findAny() - gets any element
        System.out.println("\n12. findAny() - Any string starting with 'a':");
        Optional<String> any = strings.stream()
                .filter(s -> s.startsWith("a"))
                .findAny();
        if (any.isPresent()) {
            System.out.println(any.get());
        }
        
        // 13. anyMatch() - checks if any element matches condition
        System.out.println("\n13. anyMatch() - Any number greater than 8:");
        boolean hasGreaterThan8 = numbers.stream()
                .anyMatch(n -> n > 8);
        System.out.println(hasGreaterThan8);
        
        // 14. allMatch() - checks if all elements match condition
        System.out.println("\n14. allMatch() - All numbers are positive:");
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(allPositive);
        
        // 15. noneMatch() - checks if no elements match condition
        System.out.println("\n15. noneMatch() - No numbers less than 0:");
        boolean noneLessThanZero = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println(noneLessThanZero);
        
        // 16. min() - finds minimum element
        System.out.println("\n16. min() - Minimum number:");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println(min.get());
        }
        
        // 17. max() - finds maximum element
        System.out.println("\n17. max() - Maximum number:");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println(max.get());
        }
        
        // 18. flatMap() - flattens nested streams
        System.out.println("\n18. flatMap() - Flatten nested lists:");
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        nestedLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
        
        // 19. peek() - performs action without modifying stream
        System.out.println("\n19. peek() - Debug stream:");
        numbers.stream()
                .filter(n -> n > 5)
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * 2)
                .forEach(System.out::println);
        
        // 20. toArray() - converts stream to array
        System.out.println("\n20. toArray() - Convert to array:");
        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
        
        // 21. groupingBy() - groups elements by key
        System.out.println("\n21. groupingBy() - Group by length of strings:");
        Map<Integer, List<String>> grouped = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
        
        // 22. partitioningBy() - partitions into two groups
        System.out.println("\n22. partitioningBy() - Partition into even/odd:");
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even: " + partitioned.get(true));
        System.out.println("Odd: " + partitioned.get(false));
        
        // 23. joining() - joins strings
        System.out.println("\n23. joining() - Join strings:");
        String joined = strings.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joined);
        
        // 24. summingInt() - sums integers
        System.out.println("\n24. summingInt() - Sum using collector:");
        int totalSum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Total: " + totalSum);
        
        // 25. averagingInt() - calculates average
        System.out.println("\n25. averagingInt() - Average:");
        double average = numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average: " + average);
    }
}

