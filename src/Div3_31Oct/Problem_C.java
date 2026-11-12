package Div3_31Oct;

import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long s = 0;
            boolean flag = false;
            boolean b = false;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                s += a;
                if (a >= 2) {
                    if(i > 0 && i < n - 1) {
                        flag= true;
                    }else b = true;
                }
            }
            if (flag) {
                System.out.println(s - 1);
            } else if(b) {
                System.out.println(s - (n - 1));
            } else System.out.println(-1);
        }
    }
}
