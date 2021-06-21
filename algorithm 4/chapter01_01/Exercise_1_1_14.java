package chapter01_01;

public class Exercise_1_1_14 {
    public static void main(String[] args) {
        int N = 100;
        System.out.print(lg(N));
    }
    private static int lg(int N) {
        int i = 0;
        int val = 1;
        while (val * 2 < N) {
            val *= 2;
            i++;
        }
        return i;
    }
}
