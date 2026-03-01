package Codeforces_Question.Div2;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    a.add(i + 1);
                } else {
                    b.add(i + 1);
                }
            }
            int x = a.size();
            int y = b.size();
            if (x % 2 == 0) {
                System.out.println(x);
                if (x > 0) {
                    for (int idx : a) {
                        System.out.print(idx + " ");
                    }
                    System.out.println();
                }
            } else if (y % 2 == 1) {
                System.out.println(y);
                if (y > 0) {
                    for (int idx : b) {
                        System.out.print(idx + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}