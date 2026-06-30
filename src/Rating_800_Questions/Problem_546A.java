package Rating_800_Questions;

import java.util.Scanner;

public class Problem_546A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int ruppee = 0;
        for (int i = 1; i <= w; i++) {
            ruppee += i*k;
        }
        int ans = ruppee-n;
        if(ans<0) ans = 0;
        System.out.println(ans);
    }
}
