package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_11 {
    public static void main(String[] args) {
        boolean[][] a = {{true, false, false, true}, {false, true, false, false}, {true, true, true, true}};
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
                StdOut.printf(" 行号" + i);
                StdOut.printf(" 列号" + j);
                StdOut.print('\n');
            }
        }
    }
}
