package chapter01_02;

import edu.princeton.cs.algs4.StdOut;

public class TestDate {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Date date = new Date(m, d, y);
        Date date1 = new Date(m, d, y);
        StdOut.println(date);
        StdOut.print(date.equals(date1));
    }
}
