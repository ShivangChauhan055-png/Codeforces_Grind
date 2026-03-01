package Div2;

import java.util.Scanner;

public class Problem_Parkour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if ((a-2*b)%3!=0) {
                System.out.println("NO");
                continue;
            }
            long k=(a-2*b)/3;
            if(k<0){
                System.out.println("NO");
                continue;
            }
            long minimumC=Math.max(0, -b);
            long maximumC=k / 2;
            if (minimumC<=maximumC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
