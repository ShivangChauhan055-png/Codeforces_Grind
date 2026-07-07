package Div2_6July;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int atLeastTwo = 0;
            boolean atLeastThree = false;
            for (int i = 0; i < k; i++) {
                long x = sc.nextLong();
                if (x >= 3) {
                    atLeastThree = true;
                }
                if (x >= 2) {
                    atLeastTwo++;
                }
            }
            if (atLeastThree || atLeastTwo >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
