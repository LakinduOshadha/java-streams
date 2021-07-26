package java.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * CalculateFibonacci_5 calculates a Fibonacci sequence
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class CalculateFibonacci {
    // Global map obj to store fibonacci numbers
    private static Map<Integer, Integer> map = new HashMap<>();

    /**
     * getFibonacci efficiently calculates a Fibonacci number
     * using just the computeIfAbsent method
     *
     * @param n needed fibonacci number index n
     * @return fibonacci number of index n
     */
    private static int getFibonacci(int n) {
        // Initial values
        if (n == 0) return 0;
        if (n == 1) return 1;
        // putting index and corresponding fibonacci number to map
        return  map.computeIfAbsent(n, e -> getFibonacci(e - 1) + (getFibonacci(e - 2)));
    }

    public static void main(String[] args) {
        // Getting user input
        System.out.print("Enter the needed fibonacci number index (n) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Initial values
        map.put(0, 0);
        map.put(1, 1);
        // calling getFibonacci method
        System.out.println(n + " th Fibonacci Number : " + getFibonacci(n));
        // printing fibonacci numbers smaller than index n
        System.out.println("Fibonacci numbers smaller than index n : " + map);
    }
}
