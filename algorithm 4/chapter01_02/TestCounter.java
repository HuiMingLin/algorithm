package chapter01_02;

import edu.princeton.cs.algs4.*;

public class TestCounter {
    public static void main(String[] args) {
        StdOut.println("模拟 T 次掷硬币: ");
        Filps();
        StdOut.println("\n模拟 T 次掷骰子: ");
        Rolls();
        StdOut.println("\nInterval2D: ");
        interval2D();
    }
    public static void Filps() {
        int T = Integer.parseInt("1000");
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int t = 0; t < T; t++) {
            if(StdRandom.bernoulli(0.5)) {
                heads.increment();
            } else {
                tails.increment();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(d));

        if(heads.tally() == tails.tally()) {
            StdOut.println("Tie");
        } else {
            StdOut.println(FilpsMax(heads, tails) + " wins");
        }
    }
    public static Counter FilpsMax(Counter x, Counter y) {
        if(x.tally() > y.tally()) return x;
        else {
            return y;
        }
    }

    public static void Rolls() {
        int T = Integer.parseInt("1000");
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 0; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }
        for (int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }
        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }

    public static void interval2D() {
        String[] args = {"0.2", "0.5", "0.5", "0.6", "1000", "hits"};
        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        int T = Integer.parseInt(args[4]);

        Interval1D xinterval = new Interval1D(xlo, xhi);
        Interval1D yinterval = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();

        Counter c = new Counter(args[4]);
        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            if(box.contains(p)) c.increment();
            else p.draw();
        }
        StdOut.println(c);
        StdOut.println(box.area());
    }
}
