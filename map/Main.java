package com.company.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        mapExamples();
        filterExamples();
        aggregatingOperationsExamples();
        moreFunnyExamples();
    }

    private static void mapExamples() {
        String s = "1 2 3 4 5 6 7 8 9 10";

        System.out.println("1. Mapping with a one-argument function:");
        List<Integer> ints = Arrays.stream(s.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(ints);

        System.out.println("2. Mapping with a simple lambda expression:");
        List<Double> pow2 = ints.stream().map(x -> Math.pow(2.0, x)).collect(Collectors.toList());
        System.out.println(pow2);
        List<String> doubled = ints.stream().map(i -> i + "_" + i).collect(Collectors.toList());
        System.out.println(doubled);

        System.out.println("3. Mapping with complex function:");
        // Though this one can be simplified to the form in (2). Try it.
        List<Integer> pows = pow2.stream().map(d -> {
            String str = Double.toString(d);
            return str.length();
        }).collect(Collectors.toList());
        System.out.println(pows);

        // Everywhere else where you have to pass a function or a predicate, you can use one of the three forms:
        // 1. Function reference, e.g. `Integer::parseInt`
        // 2. One-expression lambda, e.g `x -> Integer.parseInt(x)`
        // 3. Lambda with body, e.g. `x -> { return Integer.parseInt(x); }`
    }

    private static void filterExamples() {
        List<String> words = Arrays.asList("tst", "one", "two", "three", "four", "five", "rotator", "deified");

        System.out.println("1. Simple filtering");
        List<String> longWords = words.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
        System.out.println(longWords);

        System.out.println("2. A little more complex filtering");
        List<String> palindromes = words.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromes);
    }

    private static void aggregatingOperationsExamples() {
        List<String> words = Arrays.stream("Once upon a midnight dreary while I pondered weak and weary".split("\\s+"))
                .collect(Collectors.toList());

        System.out.println("1. Check if all items satisfy a criterion:");
        boolean noWordsLongerThan9 = words.stream().allMatch(w -> w.length() <= 9);
        boolean theSame = words.stream().noneMatch(w -> w.length() > 9);
        System.out.println(noWordsLongerThan9);

        System.out.println("2. Check if any item satisfies a criterion:");
        boolean hasShortWords = words.stream().anyMatch(w -> w.length() < 3);
        System.out.println(hasShortWords);

        System.out.println("3. Average over the items");
        //Note the last call. If stream contains no items, it will return 0.0;
        double average = words.stream().mapToInt(String::length).average().orElse(0.0);
        System.out.println(average);

        System.out.println("4. Count items that satisfy a criterion:");
        long wordsWithE = words.stream().filter(w -> w.contains("e")).count();
        System.out.println(wordsWithE);

        System.out.println("5. Max and sum");
        int maxWordLength = words.stream().mapToInt(String::length).max().orElse(0); //min is the same
        int sumWordLength = words.stream().mapToInt(String::length).sum();
        System.out.println("max: " + maxWordLength + ", sum: " + sumWordLength);
    }

    private static void moreFunnyExamples() {
        List<String> words = Arrays.stream("These examples cover only a small part of Java 8 Streams.".split("\\s+"))
                .collect(Collectors.toList());

        System.out.println("1. Join to string:");
        String noDelimiter = words.stream().collect(Collectors.joining());
        System.out.println(noDelimiter);
        String withDelimiter = words.stream().map(it -> Integer.toString(it.length())).collect(Collectors.joining(" + "));
        System.out.println(withDelimiter);

        System.out.println("2. Concat two streams:");
        List<String> concat = Stream.concat(words.stream(),
                words.stream().map(s -> new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(concat);

        System.out.println("3. Create a Map from stream");
        //toMap takes two arguments: the first is the function to get keys (we pass identity there -- it is a function
        //that returns exactly its argument, like `x -> x`, and the second one to get values.
        Map<String, Integer> map = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);

        System.out.println("4. Distinct items of a stream:");
        //Here's also a way to create a stream directly from values
        Set<Integer> unique = Stream.of(5, 1, 2, 3, 4, 5, 4, 3, 2, 1).collect(Collectors.toSet());
        System.out.println(unique);

        System.out.println("5. Sorted stream");
        List<String> sorted = Stream.of("a", "z", "b", "c").sorted().collect(Collectors.toList());
        System.out.println(sorted);

        System.out.println("6. Limit and skip");
        List<Integer> part = Stream.of(1, 2, 3, 4, 5, 7, 8, 9).skip(2).limit(4).collect(Collectors.toList());
        System.out.println(part);

        System.out.println("7. Production of ints in the stream");
        // This example is a bit complex, but it can be useful to learn the concept of `reducing`.
        // `reduce` is an operation with an accumulator: we provide an initial value for the accumulator and a function
        // with two arguments. As one of the arguments the current accumulator value will always be passed.
        // The function is applied to every item in the stream and its result is the next value of the accumulator.
        //
        // Now let's try to implement ints production which, unfortunately, is not there along with `sum` and `average`.
        int production = Stream.of(1, 2, 3, 5, 7, 11).reduce(1, (acc, i) -> acc * i);
        System.out.println(production);

        System.out.println("8. Int range");
        // Yeah, `mapToObj(i -> i)` looks weird, but in Java IntStream and Stream are not the same, and this is the
        // way to convert one to another.
        List<Integer> range = IntStream.range(1, 10).mapToObj(i -> i).collect(Collectors.toList());
        System.out.println(range);
        // Uses the production
        int factorial = range.stream().reduce(1, (acc, i) -> acc * i);
        System.out.println(factorial);

        System.out.println("9. Flat map");
        // Flat map is another concept which is not that simple, but might be useful.
        // Flat map is similar to map: it iterates over every item in the stream and calls the function which you
        // pass as the argument. But your function should return not a single value but a stream. And flat map then
        // concatenates all the streams returned.
        List<Character> chars = words.stream()
                .flatMap(w -> w.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(chars);

        System.out.println("10. Group by");
        // The result is a map where for each value of the function passed to groupingBy there is a list of the stream
        // items which had this value.
        Map<Integer, List<String>> wordsByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(wordsByLength);
    }
}
