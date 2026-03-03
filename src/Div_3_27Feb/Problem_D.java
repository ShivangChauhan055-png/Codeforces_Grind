package Div_3_27Feb;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] p = new int[n];
            for(int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            int minIndex = x;
            for(int i = x; i < y; i++) {
                if(p[i] < p[minIndex]) {
                    minIndex = i;
                }
            }
            int[] temp = new int[y - x];
            int idx = 0;
            for(int i = minIndex; i < y; i++) {
                temp[idx++] = p[i];
            }
            for(int i = x; i < minIndex; i++) {
                temp[idx++] = p[i];
            }
            idx = 0;
            for(int i = x; i < y; i++) {
                p[i] = temp[idx++];
            }
            for(int i = 0; i < n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
    }
}