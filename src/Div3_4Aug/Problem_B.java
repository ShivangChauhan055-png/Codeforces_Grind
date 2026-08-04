package Div3_4Aug;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    count++;
                }
            }
            int ans = count;
            for (int i = 1; i < n - 1; i++) {
                int dec = 0;
                char left = s.charAt(i - 1);
                char mid = s.charAt(i);
                char right = s.charAt(i + 1);
                if (left != mid && mid != right) {
                    if (left == right) {
                        dec = 2;
                    } else {
                        dec= 1;
                    }
                }
                ans = Math.min(ans, count - dec);
            }
            System.out.println(ans);
        }
    }
}

