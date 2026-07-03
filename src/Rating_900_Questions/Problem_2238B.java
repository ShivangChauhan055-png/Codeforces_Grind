package Rating_900_Questions;

import java.util.Scanner;

public class Problem_2238B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int t = sc.nextInt();
            long ans = 0;
            for(int i=1;i<=t;i++){
                int number = t/i;
                ans += (long) number *number;
            }
            System.out.println(ans);
        }
    }
}
