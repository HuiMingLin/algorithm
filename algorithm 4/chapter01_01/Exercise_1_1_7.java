package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_7 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            StdOut.printf("%f\n", t);
        }
        StdOut.printf("%.5f\n", t);
        StdOut.print("\n");

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for(int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.printf("%d\n", sum);
        StdOut.print("\n");

        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for(int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.printf("%d\n", sum);
    }
}
