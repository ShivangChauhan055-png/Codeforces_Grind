package Div3_4Aug;
import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int oA = 0, oB = 0;
            int oddA = 0, oddB = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    oA++;
                    if ((i + 1) % 2 == 1) oddA++;
                }
                if (b.charAt(i) == '1') {
                    oB++;
                    if ((i + 1) % 2 == 1) oddB++;
                }
            }
            if (oA == oB && oddA == oddB) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
