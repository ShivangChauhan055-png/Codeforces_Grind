package Super150_contest2;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0;
        int b = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                a++;
            } else {
                if(a > 0) {
                    a--;
                    b++;
                }
            }
        }
        System.out.println(b * 2);
    }
}
