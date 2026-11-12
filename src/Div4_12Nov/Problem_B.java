package Div4_12Nov;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char cur = 'R';
            int ans = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (cur != c) ans++;
                if (c == 'R') {
                    cur = 'B';
                } else {
                    cur = 'R';
                }
            }
            System.out.println(ans);
        }
    }
}
