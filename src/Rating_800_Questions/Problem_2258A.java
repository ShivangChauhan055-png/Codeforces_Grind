package Rating_800_Questions;

import java.util.*;

public class Problem_2258A {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = a%b;
            a=b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = gcd(arr[0],arr[n-1]);
            System.out.println(ans);

        }
    }
}
