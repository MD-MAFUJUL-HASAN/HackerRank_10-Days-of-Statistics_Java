import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        System.out.format("%.1f", standardDeviation(array));
    }

    public static double getMean(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return (double) sum / array.length;
    }

    public static double standardDeviation(int[] array) {
        double mean = getMean(array);
        double sum = 0;
        for (int x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }
}
