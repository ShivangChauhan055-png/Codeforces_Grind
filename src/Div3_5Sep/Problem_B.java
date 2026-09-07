package Div3_5Sep;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            int a0 = 0;
            int a2 = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 1) odd++;
                else if (x % 4 == 0) a0++;
                else a2++;
            }
            System.out.println(Math.max(odd, Math.max(a0, a2)));
        }
    }
}
