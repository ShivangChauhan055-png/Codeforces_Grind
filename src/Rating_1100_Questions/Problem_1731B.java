package Rating_1100_Questions;

import java.util.Scanner;

public class Problem_1731B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long ans = (((n * (n + 1)) % 1000000007)* (4 * n - 1)) % 1000000007;
            ans = (ans*337)%1000000007; // 337 is 2022/6
            System.out.println(ans);
        }
    }
}
