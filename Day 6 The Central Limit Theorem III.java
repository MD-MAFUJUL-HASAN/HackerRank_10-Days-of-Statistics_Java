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
        /* Provided variables */
        double mean   = 500;
        double std    = 80;
        int    n      = 100;
        double zScore = 1.96; // equivalent to 95% confidence interval
        
        /* Formula (found online) for confidence interval +/- */
        double marginOfError = zScore * std / Math.sqrt(n);

        /* Print output */
        System.out.format("%.2f%n", mean - marginOfError);
        System.out.format("%.2f%n", mean + marginOfError);
    }
}
