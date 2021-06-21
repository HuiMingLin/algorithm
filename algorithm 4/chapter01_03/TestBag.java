package chapter01_03;

import edu.princeton.cs.algs4.StdOut;

public class TestBag {
    public static void main(String[] args) {
        stats();
    }
    // 计算平均值和样本标准差
    public static void stats() {
        Bag<Double> numbers = new Bag<Double>();
        double[] d = {100.0, 99.0, 101.0, 120.0, 98.0, 107.0, 109.0, 81.0, 101.0, 90.0};
        for (int i = 0; i < d.length; i++) {
            numbers.add(d[i]);
        }
        int N = numbers.size();

        double sum = 0.0;
        for(double x: numbers) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N-1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
