package chapter01_03;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class TestQueue {
    public static void main(String[] args) {
        String str = "to be or not to - be - - that - - - is";
        Queue<String> w = new Queue<String>();
        test1(str, w);
    }
    public static void test1(String str, Queue s) {
        String[] _str = str.split(" ");
        for (String _s : _str) {
            if(!_s.equals("-")) {
                s.enqueue(_s);
            } else if(!s.isEmpty()) {
                StdOut.print(s.dequeue() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }
        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = q.dequeue();
        }
        return a;
    }
}
