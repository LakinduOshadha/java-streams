package java.streams;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * LongestName_4a finds the longest name.
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class LongestName {
    /**
     * printLongestName prints the longest name.
     *
     * @param names Stream of names
     */
    public static void printLongestName(Stream<String> names) {
        System.out.println(names.collect(Collectors.maxBy(Comparator.comparing(name->name.length()))).get());
        // prints the longest name with reduce function
        // System.out.println(names.reduce((c,e) -> c.length() < e.length() ? e : c).orElse("null"));
    }

    /**
     * main
     *
     * @param args null
     */
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John Lennon", "Paul McCartney",
                "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        printLongestName(names); // Calling printLongestName method
    }

}
