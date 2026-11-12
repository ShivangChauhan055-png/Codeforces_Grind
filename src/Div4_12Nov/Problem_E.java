package Div4_12Nov;

import java.util.Scanner;
public class Problem_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (i % (k + 1) == 0) {
                    ans ^= (x % 2);
                }
            }
            if (ans == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
