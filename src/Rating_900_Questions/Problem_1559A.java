package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1559A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int a =sc.nextInt();
                if(i==0) ans = a;
                else ans &=a;
            }
            System.out.println(ans);
        }
    }
}
