package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_10 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i < 10; i++) {
            a[i] = i * i;
            StdOut.println(a[i]);
        }
    }
}
