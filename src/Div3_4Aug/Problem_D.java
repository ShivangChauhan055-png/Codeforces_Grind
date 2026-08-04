package Div3_4Aug;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            ArrayList<Integer> evenA = new ArrayList<>();
            ArrayList<Integer> evenB = new ArrayList<>();
            ArrayList<Integer> oddA = new ArrayList<>();
            ArrayList<Integer> oddB = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    if (i % 2 == 0) evenA.add(i / 2);
                    else oddA.add(i / 2);
                }
                if (b.charAt(i) == '1') {
                    if (i % 2 == 0) {
                        evenB.add(i / 2);
                    } else {
                        oddB.add(i / 2);
                    }
                }
            }
            if (evenA.size() != evenB.size() || oddA.size() != oddB.size()) {
                System.out.println(-1);
                continue;
            }
            long ans = 0;
            for (int i = 0; i < evenA.size(); i++) {
                ans += Math.abs(evenA.get(i) - evenB.get(i));
            }
            for (int i = 0; i < oddA.size(); i++) {
                ans += Math.abs(oddA.get(i) - oddB.get(i));
            }
            System.out.println(ans);
        }
    }
}
