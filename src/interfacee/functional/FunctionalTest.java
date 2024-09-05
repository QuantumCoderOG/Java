package src.interfacee.functional;

import java.util.List;
import java.util.UUID;
import java.util.function.*;

public class FunctionalTest {
    public static void main(String[] args) {
        Predicate<Integer>isEven = x -> x%2==0;
        Predicate<Integer>isNotNull =  x->x!=null;
        System.out.println(isNotNull.and(isEven).test(null));
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));

        Supplier<String>supplier = () -> String.valueOf(UUID.randomUUID());
        System.out.println(supplier.get());

        Consumer<String> toUpperCase = x->System.out.println(x.toUpperCase());
        toUpperCase.accept("Hello, world!");


        Function<String,Integer>function = x->x.length();
        System.out.println(function.apply("test"));


        BiFunction<String,String,Integer>biFunction = ( a, b) -> a.length() + b.length();
        System.out.println(biFunction.apply("ravi","bhushan"));

        BiConsumer<String,String>biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept("lll","kkk");


        BiSupplierWithReturn biSupplierWithReturn = (a,b)-> List.of(a,b);
        System.out.println(biSupplierWithReturn.apply(1,3));





    }
}
