package Div_2_16March;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i =0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int Maximum = 0 ;
            int op = 0;
            for (int i=0;i<n;i++) {
                if(arr[i]>=Maximum){
                    Maximum=arr[i];
                    op++;
                }
            }
            System.out.println(op);
        }
    }
}
