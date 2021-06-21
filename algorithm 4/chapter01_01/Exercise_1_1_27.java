package chapter01_01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_27 {
    private static long COUNT = 0;
//    public static double binomial(int N, int k, double p)  {
//        COUNT++;
//        StdOut.println(COUNT);
//        if(N == 0 && k == 0) return 1.0;
//        if(N < 0 || k < 0) return 0.0;
//        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
//    }
    private static double[][] M;

    private static double binomial(int N, int k, double p) {
        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (M[N][k] == -1) {  //将计算结果存起来，已经计算过的直接拿过来用，无需再递归计算
            M[N][k] = (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        }
        return M[N][k];
    }

    public static double Binomial(int N, int k, double p) {
        M = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                M[i][j] = -1;
            }
        }
        return binomial(N, k, p);
    }
    public static void main(String[] args) {
//        double data = binomial(100, 50, 0.25);
        double data = Binomial(100, 50, 0.25);
        StdOut.println(data);
        StdOut.println(COUNT);
    }
}