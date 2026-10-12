package Div3_7Oct;

import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int r = sc.nextInt();
            // (x0-x)^2 + (y0-y)^2 = r^2
            int x = x0 + r;
            int y = y0;
            System.out.println(x + " " + y);
        }
    }
}
