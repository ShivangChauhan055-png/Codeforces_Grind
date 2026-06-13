package Div3_12June;

import java.util.*;

public class Problem_C {
    static List<long[]> op(long num, long x) {
        List<long[]> s = new ArrayList<>();
        long cur = num;
        int divs = 0;
        while (true) {
            s.add(new long[]{cur, divs});
            if (cur == 0) break;
            cur /= x;
            divs++;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            List<long[]> A = op(a, x);
            List<long[]> B = op(b, x);
            long ans = Math.abs(a - b);
            for (long[] p1 : A) {
                long va = p1[0];
                long da = p1[1];
                for (long[] p2 : B) {
                    long vb = p2[0];
                    long db = p2[1];
                    ans = Math.min(ans,da + db + Math.abs(va - vb));
                }
            }
            System.out.println(ans);
        }
    }
}