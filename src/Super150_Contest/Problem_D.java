package Super150_Contest;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rect = new int[3][2];

        for (int i = 0; i < 3; i++) {
            rect[i][0] = sc.nextInt(); // width
            rect[i][1] = sc.nextInt(); // height
        }

        boolean possible = false;

        for (int poss = 0; poss < 8; poss++) {

            int[] w = new int[3];
            int[] h = new int[3];

            for (int i = 0; i < 3; i++) {
                if ((poss & (1 << i)) != 0) {

                    w[i] = rect[i][1];
                    h[i] = rect[i][0];
                } else {
                    w[i] = rect[i][0];
                    h[i] = rect[i][1];
                }
            }

            if (w[0] == w[1] && w[1] == w[2]) {
                if (h[0] + h[1] + h[2] == w[0]) {
                    possible = true;
                    break;
                }
            }
        }

        System.out.println(possible ? "YES" : "NO");
    }
}
