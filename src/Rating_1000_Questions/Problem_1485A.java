package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_1485A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int ans = Integer.MAX_VALUE;
            for(int i=0;i<=1000;i++){
                if(b+i==1) continue;
                int x = a;
                int count = i;
                while(x>0){
                    x = x/(b+i);
                    count++;
                }
                ans = Math.min(ans,count);
            }
            System.out.println(ans);
        }
    }
}
