package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1855B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long lcm = 1;
            int ans = 0;
            for(long i =1;i<50;i++){
                lcm = LCM(lcm,i);
                if(n%lcm==0) ans++;
                else break;
            }
            System.out.println(ans);
        }
    }

    public static long gcd(long a, long b) {
        while(b!=0){
            long temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
    public static long LCM(long a,long b){
        return a*(b/gcd(a,b));
    }
}
