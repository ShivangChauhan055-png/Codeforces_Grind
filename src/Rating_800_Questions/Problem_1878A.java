package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(x==k){
                    ans = true;
                }
            }
            if(ans) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
