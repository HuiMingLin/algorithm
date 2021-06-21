package chapter01_01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_5 {
    public static void main(String[] args) {
        int index = 0;
        int max = 2;
        double x = 0.0;
        double y = 0.0;
        while(!StdIn.isEmpty()){
            if (index == max) {
                break;
            }
            if (index == 0) {
                x = StdIn.readDouble();
            } else {
                y = StdIn.readDouble();
            }
            index++;
        }
        if (index < max) {
            StdOut.printf("not valid, must be " + max);
        } else if ((0 < x && x < 1 && 0 < y && y < 1)) {
            StdOut.print(true);
        } else {
            StdOut.print(false);
        }
    }
}
