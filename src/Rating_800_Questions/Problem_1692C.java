package Rating_800_Questions;

import java.util.*;

public class Problem_1692C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char[][] chess = new char[8][8];
            for(int i=0;i<8;i++){
                chess[i] = sc.next().toCharArray();
            }
            for(int i=1;i<7;i++){
                for(int j=1;j<7;j++){
                    if (chess[i][j] == '#' &&
                            chess[i-1][j-1] == '#' &&
                            chess[i-1][j+1] == '#' &&
                            chess[i+1][j-1] == '#' &&
                            chess[i+1][j+1] == '#') System.out.println((i+1)+" "+(j+1));
                }
            }
        }
    }
}
