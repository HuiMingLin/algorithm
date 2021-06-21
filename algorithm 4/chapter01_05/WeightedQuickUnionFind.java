package chapter01_05;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnionFind {
    private int[] id; // 分量id（以触点为索引）
    private int[] sz; // 由触点索引的 各个根节点所对应的分量的大小
    private int count; // 分量数量
    public WeightedQuickUnionFind(int N) {
        // 初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }
    public int count() {
        return count;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if(i == j) return;

        // 将小树的根节点连接到大树的根节点
        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedQuickUnionFind uf = new WeightedQuickUnionFind((N));
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
