package chapter01_01;

public class Exercise_1_1_29 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }
    public static int rank(int key, int[] a, int lo, int hi) {
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid]) {
            hi = mid;
            return rank(key, a, lo, hi);
        } else if(key > a[mid]) {
            lo = mid + 1;
            return rank(key, a, lo, hi);
        } else if (mid > 0 && a[mid - 1] == key) {
            hi = mid;
            return rank(key, a, lo, hi);
        } else {
            return mid;
        }
    }
    public static int count(int key, int[] a) {
        int lowers = rank(key, a);
        int index = lowers;

        if (index == a.length || key != a[index]) {
            return 0;
        }

        int cnt = 1;
        while ((index < a.length - 1) && (a[index] == a[index + 1])) {   //
            // 注意判断条件的先后顺序
            ++cnt;
            ++index;
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 5, 8, 9, 10};
        int i = rank(4, a);
        int j = count(4, a);
        System.out.println(i);
        System.out.println(j);
    }
}