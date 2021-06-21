package chapter01_01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_21 {
    public static void main(String[] args) {
        int max = 3;
        int index = 0;
        String[] data = new String[max];
        while (!StdIn.isEmpty())
        {  // Read a number and cumulate the sum.
            String text = StdIn.readLine();
            data[index++] = text;
        }
        for (int i = 0; i < max; i++) {
            StdOut.printf("\n", data[i]);
            String[] text = data[i].split("\\s+");
            double temp = Double.parseDouble(text[1]) / Double.parseDouble(text[2]);
            StdOut.printf("%-10s   %-10s   %-10s   %-13.3f\n", text[0], text[1], text[2], temp);
        }
    }
}