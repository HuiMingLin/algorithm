package chapter01_01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_3 {
    public static void main(String[] args) {
        int index = 0;
        boolean isValid = true;
        double num = 0.0;
        while(!StdIn.isEmpty()){
            if (index == 3) {
                break;
            }
            if (index == 0) {
                num = StdIn.readDouble();
            } else {
                if (num != StdIn.readDouble()) {
                    isValid = false;
                }
            }
            index++;
        }
        if (index < 3) {
            StdOut.printf("not valid");
        } else if (isValid) {
            StdOut.printf("equal");
        } else {
            StdOut.printf("not equal");
        }
    }
}
