package chapter01_03;

//E.W.Dijkstra 的双栈算法表达式求值算法

import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Evaluate {
    public static void doSth(String str) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        String[] _str = str.split(" ");

        for (int i = 0; i < _str.length; i++) {
            String s = _str[i];
            if(s.equals("(")) {

            } else if(s.equals("+")) {
                ops.push(s);
            } else if(s.equals("-")) {
                ops.push(s);
            } else if(s.equals("*")) {
                ops.push(s);
            } else if(s.equals("/")) {
                ops.push(s);
            } else if(s.equals("sqrt")) {
                ops.push(s);
            } else if(s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+")) {
                    v = vals.pop() + v;
                } else if(op.equals("-")) {
                    v = vals.pop() - v;
                } else if(op.equals("*")) {
                    v = vals.pop() * v;
                } else if(op.equals("/")) {
                    v = vals.pop() / v;
                } else if(op.equals("sqrt")) {
                    v = Math.sqrt(v);
                } else {
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
