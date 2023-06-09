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
        int[] elements = new int[size];
        int[] weights = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            weights[i] = scan.nextInt();
        }
        scan.close();

        /* Calculate weighted mean */
        int total = 0;
        int totalWeights = 0;
        for (int i = 0; i < size; i++) {
            total += elements[i] * weights[i];
            totalWeights += weights[i];
        }
        double weightedMean = (double) total / totalWeights;
        System.out.format("%.1f", weightedMean);
    }
}
