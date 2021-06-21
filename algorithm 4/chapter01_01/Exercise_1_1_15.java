package chapter01_01;

public class Exercise_1_1_15 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 1, 2, 6, 2, 6, 1, 23};
        int M = 10;
        int b[] = histogram(a, M);
        System.out.println("调用函数后获取的数组：");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    private static int[] histogram(int[] a, int M) {
        int[] temp = new int[M];
        for (int i = 0; i < M; i++) {
            int n = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    n++;
                }
            }
            temp[i] = n;
        }
        return temp;
    }

    public static int[] histogram2(int[] a, int M) {
        int[] h = new int[M];
        int N = a.length;
        for (int i = 0; i < N; i++)
            // 为什么 a[i] 会小于 M
            if (a[i] < M)
                h[a[i]]++;
        return h;
    }
}