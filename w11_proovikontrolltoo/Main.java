import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1,2,3);
        List<Character> characters = Arrays.asList('a','b','c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);

        List<String> emptysStrings = new ArrayList<>();

        System.out.println(
            Generics.getFirst(strings) + " " +
            Generics.getFirst(integers) + " " +
            Generics.getFirst(characters) + " " +
            Generics.getFirst(doubles) + " " +
            Generics.getFirst(emptysStrings) + " " 
        );

        Generics.printList(strings);
        System.out.println("Sum of integers is " + Generics.sumOfList(integers));
        Generics.lowerBound(integers);

        SimplePair<Integer, String> pair = new SimplePair<>(5, "Markus");
        System.out.println(pair.getKey() + " " + pair.getValue());

        SimplePair<Integer, SimplePair<Integer, String>> pair2 = new SimplePair<>(1, new SimplePair<>(2, "nested"));

        System.out.println(
        Generics.getType(1) + " " +
        Generics.getType("markus") + " ");

        String[] stringarray = {"hello", "woröd", "fdgs"};
        Integer[] integerarray = {1,3,41,51,24};
        Generics.printArray(stringarray);
        Generics.printArray(integerarray);

        SimpleGenerics<String> sg = new SimpleGenerics<>();

        System.out.println();



    }
}