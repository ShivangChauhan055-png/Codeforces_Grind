package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1806A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sx = sc.nextInt();
            int sy = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();
            if(dy<sy){
                System.out.println(-1);
                continue;
            }
            int moves = dy-sy;
            sx+=moves;
            if(sx<dx){
                System.out.println(-1);
                continue;
            }
            moves+=(sx-dx);
            System.out.println(moves);
        }
    }
}
