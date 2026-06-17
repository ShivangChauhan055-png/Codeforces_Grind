package Rating_800_Questions;

import java.util.Scanner;

public class Problem_2218B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int maxi  = Integer.MIN_VALUE;
            long sum = 0;
            for (int i = 0; i < 7; i++) {
                int x = sc.nextInt();
                sum+=x;
                maxi = Math.max(x,maxi);
            }
            System.out.println(2L*maxi - sum);
        }
    }
}
