package chapter01_01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_9 {
    public static void main(String[] args) {
        String s = "";
        int N = StdIn.readInt();
        for(int n = N; n > 0; n /= 2) {
            StdOut.print(n % 2);
            StdOut.print("\n");
            s = (n % 2) + s;
        }
        StdOut.println(s);
        StdOut.printf(decimalToBinary(N));
    }
    public static String decimalToBinary(int n) {
        String resultString = "";
        for (int i = 31; i >= 0; i--)
            resultString = resultString + (n >>> i & 1);
        return resultString;
    }
}
