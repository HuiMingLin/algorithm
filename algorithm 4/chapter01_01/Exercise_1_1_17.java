package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_17 {
    public static void main(String[] args) {
        StdOut.println(exR2(6));
    }
    public static String exR2(int n) {
        if(n <= 0) return "";
        String s = exR2(n - 3) + exR2(n - 2) + n;
        return s;
    }
}