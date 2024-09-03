package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
       // 1 Sum of List Elements
        List<Integer>array = Arrays.asList(1,4,2,6,8,9,2);
        Integer sum = array.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        Integer sum2 = array.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
        Integer sum3 =array.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum3);

        // 2 Count of Even Numbers
        long countEvenNumber = array.stream().filter(x-> x % 2 ==0).count();
        System.out.println(countEvenNumber);


      //3  Convert to Uppercase
        List<String>list= List.of("apple","mango","man","go","less than five");
        List<String>upperCaseList =list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseList);


        //4 Filter Strings by Length
        List<String>lessThanFive = list.stream().filter(x-> x.length()>5).toList();
        System.out.println(lessThanFive);

        //5 Square the Numbers
        List<Integer>squareArray = array.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squareArray);


        // 6 Distinct Elements
        List<Integer>aaa = List.of(1,2,1,2,1,2);
        List<Integer>distinct = aaa.stream().distinct().toList();
        System.out.println(distinct);

        // 7 Concatenate Strings
      String concat =  list.stream().collect(Collectors.joining(","));
      String concat2 =  list.stream().collect(Collectors.joining());
      String concat1 =  list.stream().collect(Collectors.joining(",","'","'"));

        System.out.println(concat);
        System.out.println(concat2);
        System.out.println(concat1);


        // 8 Filter and Sort
        List<Integer>filter = List.of(1,2,7,3,5,6);
        List<Integer>filterAndSort = filter.stream().filter(x->x%2 !=0).sorted().toList();
        System.out.println(filterAndSort);

        // 9 Check for Presence of an Element
        Boolean ifPresent = filter.contains(2);
        System.out.println(2);

        // 10  Convert List to Set
      Set<Integer> set=  aaa.stream().collect(Collectors.toSet());
        System.out.println(set);
    }
}
