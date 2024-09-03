package src.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        //Find Max Value Given a list of integers, find the maximum value.
        List<Integer>list = List.of(1,3,6,8,1,4);
        Integer max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        Integer maxx = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(maxx);
        System.out.println(max);


        /// Product of List Elements
        Integer prod = list.stream().reduce(1,(a, b) -> a * b);
        System.out.println(prod);

        //Given a list of integers, find the first element that is greater than 6.

        Integer maxVal = list.stream().filter(x->x>6).findFirst().get();
        System.out.println(maxVal);

        //Group by First Letter

        List<String>stringList = List.of("Ravi","Bhushan","Singh");
        System.out.println(stringList.stream().collect(Collectors.groupingBy(x->x.charAt(0))));

        //Partition by Even and Odd
        System.out.println(list.stream().collect(Collectors.partitioningBy(x->x%2==0)));
        System.out.println(list.stream().collect(Collectors.partitioningBy(x->x%2==0)).get(true));

        ///Create a Map from List
        Map<String,Integer>mapp =stringList.stream().collect(Collectors.toMap(x-> x,x->x.length()));
        Map<String,Integer>mappp =stringList.stream().collect(Collectors.toMap(x-> x,String::length));
        System.out.println(mappp);
        System.out.println(mapp);


        ///Given a list of integers, skip the first 2 elements and limit the result to 3 elements.

        System.out.println(list.stream().skip(2).limit(3).collect(Collectors.toList()));

        //Given a list of integers, calculate the average of the elements.

        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));

        //Longest string in list of string
        System.out.println(stringList.stream().max(Comparator.comparingInt((String::length))).orElse(""));

        ///

        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        List<Integer>integerList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(listOfLists.stream().flatMap(List::stream).collect(Collectors.toList()));


    }
}
