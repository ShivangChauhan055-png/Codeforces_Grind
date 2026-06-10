package Div2_9June;

import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long ans1= (n + (x + y) - 1) / (x + y);
            long ans2;
            if (z * x >= n) {
                ans2 = z;
            } else {
                long rem = n - z * x;
                ans2 = z + (rem + (x + 10 * y) - 1) / (x + 10 * y);
            }
            System.out.println(Math.min(ans1, ans2));
        }
    }
}
