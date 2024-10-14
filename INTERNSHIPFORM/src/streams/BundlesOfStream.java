package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BundlesOfStream {

    public static void main(String[] args) {


        // exclude null and avoid null pointer errors
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", null);

        List<String> results = names.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList());


        System.out.println("***************************");
        System.out.println(results);



        // loop using iterator
        Stream.iterate(1, n -> n + 3)
                .limit(5)
                .forEach(System.out::println);



        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 65000),
                new Employee("Charlie", 78000),
                new Employee("Sarah", 45000)
        );


        // Calculate average salary and round it to the nearest integer
        // collecting and then method
        int averageSalary1 = employees.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Double::doubleValue), // First collector to find the average salary
                        average -> (int) Math.round(average))); // Additional operation: rounding to the nearest integer

        System.out.println("***************************");
        System.out.println("Average Salary after roundup: " + averageSalary1);

        List<Double> averageSalary2 = employees.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("***************************");
        System.out.println(averageSalary2);



        // takeWhile and DropWhile

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> takeWhileResult = numbers.stream()
                .takeWhile(num -> num <= 5)
                .collect(Collectors.toList());

        System.out.println(takeWhileResult);

        System.out.println("***************************");

        List<Integer> dropWhileResult = numbers.stream()
                .dropWhile(num -> num <= 5)
                .collect(Collectors.toList());

        System.out.println(dropWhileResult);


        System.out.println("***************************");
        List<Integer> result = numbers.stream()
                .dropWhile(num -> num <= 3)
                .takeWhile(num -> num <= 7)
                .collect(Collectors.toList());
        System.out.println(result);



        System.out.println("***************************");
        List<Integer> integerList = Arrays.asList(12, 19, 38, 397, 16, 980, 37, 165, 587, 87, 987, 568);
        Map<String, Integer> map = integerList.stream().collect(Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),// First collector: finding max
                Collectors.minBy(Integer::compareTo),// second collector: finding min
                (e1, e2) -> Map.of("max", e1.get(), "min", e2.get()) // combining results in a map
        ));
        System.out.println(map);

        System.out.println("***************************");


        // concate the using Stream.
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);

// Concatenate the two stream into a single stream
        Stream<Integer> combinedStream = Stream.concat(stream1, stream2);

// Find the sum of all the integers
        int sum = combinedStream.mapToInt(Integer::intValue).sum();

        System.out.println("Sum: " + sum); // Output: Sum: 21 (1 + 2 + 3 + 4 + 5 + 6)
        System.out.println("***************************");


        // i love this one Partition the numbers into even and odd groups
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num > 5 ));
        System.out.println(partitionedNumbers);

// Output the partitioned numbers
        System.out.println("Above Five: " + partitionedNumbers.get(true));
        System.out.println("Five and Below: " + partitionedNumbers.get(false));



        System.out.println("***************************");
         IntStream.range(1, 10)
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList()).forEach(System.out::println);
        //System.out.println(intStream1);

        List<Integer> intStream2 = IntStream.rangeClosed(1, 10)
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList());
        System.out.println(intStream2);

    }

}
