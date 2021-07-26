package java.streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * WordCount_4b counts the number of times each word appears.
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class WordCount {
    /**
     * printWordCount prints the count of the number of times each word appears.
     *
     * @param words Stream of words
     */
    public static void printWordCount(Stream<String> words) {
        // creating a map
        // key = name , value = count
        Map<String,Long> map = words.collect(Collectors.groupingBy(e -> e,Collectors.counting()));
        System.out.println(map);
    }

    /**
     * main
     *
     * @param args null
     */
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John", "Paul", "George", "John",
                "Paul", "John");
        // Calling method printWordCount
        printWordCount(names);
    }
}
