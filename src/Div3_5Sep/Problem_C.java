package Div3_5Sep;

import java.util.*;
public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int first1 = -1 , last1 = -1;
            int Minus1 = -1 ,Minus2 = -1;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i] == 1) {
                    if (first1 == -1) {
                        first1 = i;
                    } last1 = i;
                }
                if(a[i] == -1) {
                    if (Minus1 == -1) {
                        Minus1 = i;
                    } Minus2 = i;
                }
            }
            if(first1 != -1) {
                if(Minus1 != -1 &&Minus1 < first1) a[Minus1] = 1;
                if(Minus2 != -1 && Minus2 > last1) a[Minus2] = 1;
            }else{
                if (Minus1 != -1) {
                    a[Minus1] = 1;
                    a[Minus2] = 1;
                }
            }
            for(int i = 0; i < n; i++) {
                if(a[i] == -1)  a[i] = 0;
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
