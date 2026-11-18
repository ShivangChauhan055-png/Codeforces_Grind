package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int maxi = 1;
        int count = 1;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]) count++;
            else count = 1;
            maxi = Math.max(maxi,count);
        }
        System.out.println(maxi);
    }
}
