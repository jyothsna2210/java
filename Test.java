package javabasics.java8;
import java.util.*;
import java.util.logging.Filter;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[])
    {
        List<Integer>numbers=Arrays.asList(1,2,3,4,5);
        numbers.forEach((number)-> System.out.print(number+" "));
        System.out.println();
        List<String>list=numbers.stream().
                filter(number->number<5).
                filter(number->number%2==0).
                map(String::valueOf).
                collect(Collectors.toList());
list.forEach(number-> System.out.println(number));
        System.out.println(list);
    }
}
