package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1789A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextLong();
            }
            boolean ans = false;
            for(int i=0;i<n;i++){
                for(int j =i+1;j<n;j++){
                    if(gcd(a[i],a[j])<=2) ans = true;
                }
            }
            if(!ans) System.out.println("No");
            else System.out.println("Yes");
        }
    }
    public static long gcd(long a,long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
}
