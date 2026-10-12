package Div3_7Oct;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            boolean[] print = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                char ch = s.charAt(i - 1);
                if (ch == '1') {
                    st.push(i);
                } else if (ch == '2') {
                    if (!st.isEmpty()) {
                        int x = st.pop();
                        print[x] = true;
                    } else print[i] = true;
                } else print[i] = true;
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (!print[i]) {
                    ans.add(i);
                }
            }
            System.out.println(ans.size());
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
