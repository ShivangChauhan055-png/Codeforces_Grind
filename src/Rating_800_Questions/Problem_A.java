package Rating_800_Questions;

import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int c0 = 0 , c1 = 0;
            for(int x : arr){
                if(x==0) c0++;
                else c1++;
            }
            if(c1>=c0) System.out.println("Bessie");
            else System.out.println("Elsie");
        }
    }
}
