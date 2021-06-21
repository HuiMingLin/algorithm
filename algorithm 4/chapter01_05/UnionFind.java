package chapter01_05;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UnionFind {
    private int[] id; // 分量id（以触点为索引）
    private int count; // 分量数量
    public UnionFind(int N) {
        // 初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int count() {
        return count;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    // quick-find
//    public int find(int p) {
//        return id[p];
//    }
//    public void union(int p, int q) {
//        // 将 p 和 q归并到相同的分量中
//        int pID = find(p);
//        int qID = find(q);
//
//        // 如果p和q已经在相同的分量之中则不需要采取任何行动
//        if(pID == qID) return;
//
//        // 将p的分量重命名为q的名称
//        for (int i = 0; i < id.length; i++) {
//            if(id[i] == pID) {
//                id[i] = qID;
//            }
//        }
//        count--;
//    }

    // quick-union
    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }
    public void union(int p, int q) {
        // 将 p 和 q 的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;

        id[pRoot] = qRoot;

        count--;
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UnionFind uf = new UnionFind((N));
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
