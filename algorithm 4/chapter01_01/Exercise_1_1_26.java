package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_26 {
    public static void sort(int a, int b, int c) {
        int t;
        if(a > b) {
            t = a;
            a = b;
            b = t;
        }
        if(a > c) {
            t = a;
            a = c;
            c = t;
        }
        if(b > c) {
            t = b;
            b = c;
            c = t;
        }
        StdOut.println(a);
        StdOut.println(b);
        StdOut.println(c);
    }
    public static void main(String[] args) {
        sort(5, 3, 4);
    }
}