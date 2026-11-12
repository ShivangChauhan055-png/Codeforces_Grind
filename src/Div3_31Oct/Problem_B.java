package Div3_31Oct;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int n = x + y + z;
            char m;
            if (x >= y) m = 'P';
            else if (y >= z) {
                m = 'R';
            }else m = 'S';
            StringBuilder s = new StringBuilder();
            for(int i = 0; i < n; i++) {
                s.append(m);
            }
            System.out.println(s);
        }
    }
}
