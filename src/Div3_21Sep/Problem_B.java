package Div3_21Sep;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long d1 = Math.abs(a - b);
            long d2 = Math.abs(a + c - b);
            System.out.println(Math.max(d1, d2));
        }
    }
}
