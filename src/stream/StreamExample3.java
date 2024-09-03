package src.stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        // Convert the string to a stream of characters, filter distinct characters, and collect them back to a string
        String input = "Raviaa";
        String distinctChars = input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Distinct characters: " + distinctChars);

        //Find Second Highest Number
        List<Integer> numbers = List.of(1, 3, 4, 5, 7, 8,8);
        System.out.println(numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0));

        ///Find Duplicate Elements

        Set<Integer> set = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1).collect(Collectors.toSet());

        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(frequencyMap);


        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        int max = numbers.stream().max(Integer::compareTo).orElseThrow();

        int difference = max - min;

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(10)
                .map(fib -> fib[0])
                .forEach(System.out::println);

        List<Integer> numbersw = List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        int mostFrequent = numbersw.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();

        System.out.println(mostFrequent);


    }
}
