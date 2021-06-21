package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_24 {
    public static int gcd(int a, int b) {
        int A = a;
        int B = b;
        if(a < b) {
            A = b;
            B = a;
        }
        int val = A % B;
        if (val == 0) {
            return b;
        }
        System.out.println("a:"+ A + " b:" + B);
        return gcd(b, val);
    }
    public static void main(String[] args) {
        int data = gcd(1111111, 1234567);
        StdOut.println(data);
    }
}