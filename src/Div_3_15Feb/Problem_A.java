package Div_3_15Feb;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 67) f = true;
            }
            if (f) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
