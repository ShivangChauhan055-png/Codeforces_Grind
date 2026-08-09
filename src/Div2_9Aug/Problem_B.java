package Div2_9Aug;

import java.util.*;
public class Problem_B {
    static long solve(String s, int start) {
        int cnt = 0;
        for(int i = 0; i <= 1; i++) {
            boolean ok = true;
            int exp = i;
            for(int j = start; j < s.length(); j += 2) {
                if (s.charAt(j) != '?' && s.charAt(j) - '0' != exp) {
                    ok = false;
                    break;
                }
                exp ^= 1;
            }
            if(ok) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            long odd = solve(s, 0);
            long even = solve(s, 1);
            System.out.println(odd * even % 998244353);
        }
    }
}
