package chapter01_03;

import edu.princeton.cs.algs4.StdOut;

public class TestStack {
    public static void main(String[] args) {
        StdOut.println("\n颠倒数据: ");
        int[] data = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        Reverse(data);

        StdOut.println("\n双栈算法表达式求值算法: ");
        String s1 = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        String s2 = "( ( 1 + sqrt ( 5.0 ) ) / 2.0 )";
        Evaluate.doSth(s1);
        Evaluate.doSth(s2);

        StdOut.println("\n定容字符串栈: ");
        FixedCapacityStackOfString s =  new FixedCapacityStackOfString(100);
        String str = "to be or not to - be - - that - - - is";
        test(str, s);
        FixedCapacityStack c =  new FixedCapacityStack<String>(100);
        test1(str, c);

        ResizingArrayStack<String> v = new ResizingArrayStack<String>();
        test2(str, v);

        Stack<String> w = new Stack<String>();
        test3(str, w);
    }
    public static void Reverse(int[] list) {
        Stack<Integer> stack;
        stack = new Stack<Integer>();
        for (int i = 0; i < list.length; i++) {
            stack.push(list[i]);
        }
        for (int j : stack) {
            StdOut.println(j);
        }
    }
    public static void test(String str, FixedCapacityStackOfString s) {
        String[] _str = str.split(" ");
        for (String _s : _str) {
            if(!_s.equals("-")) {
                s.push(_s);
            } else if(!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
    public static void test1(String str, FixedCapacityStack s) {
        String[] _str = str.split(" ");
        for (String _s : _str) {
            if(!_s.equals("-")) {
                s.push(_s);
            } else if(!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
    public static void test2(String str, ResizingArrayStack s) {
        String[] _str = str.split(" ");
        for (String _s : _str) {
            if(!_s.equals("-")) {
                s.push(_s);
            } else if(!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
    public static void test3(String str, Stack s) {
        String[] _str = str.split(" ");
        for (String _s : _str) {
            if(!_s.equals("-")) {
                s.push(_s);
            } else if(!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
