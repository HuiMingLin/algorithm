package chapter01_04;

import chapter01_01.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TwoSumFast {
    public static int count(int[] a) {
        // 统计和为0的元组的数量
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if(BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
