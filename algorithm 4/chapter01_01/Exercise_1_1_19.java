package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_19 {
    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + Fibonacci(N));
    }
    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }
    public static long Fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        long f = 0;
        long g = 1;
        for (int i = 0; i < N ; i++) {
            f = f + g;
            g = f - g;
        }
        return f;
    }
}