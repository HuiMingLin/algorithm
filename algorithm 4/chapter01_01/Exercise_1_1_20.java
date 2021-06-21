package chapter01_01;

public class Exercise_1_1_20 {
    public static double logarithmic(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 0;
        return (logarithmic(N - 1)  + Math.log(N));
    }

    public static void main(String[] args) {
        double result = logarithmic(2);
        System.out.println(result);
    }
}