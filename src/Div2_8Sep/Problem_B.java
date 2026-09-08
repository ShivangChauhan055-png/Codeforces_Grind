package Div2_8Sep;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            long d = y - x;
            long ans = 0;
            long i = 0;
            while (i < k && x + i <= d) {
                ans += d % (x + i);
                i++;
            }
            if (i < k) {
                ans += (k - i) * d;
            }
            System.out.println(ans);
        }
    }
}
