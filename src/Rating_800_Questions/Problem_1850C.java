package Rating_800_Questions;

import java.util.*;

public class Problem_1850C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String ans = " ";
            for (int i = 0; i < 8; i++) {
                String s = sc.next();
                for(int j=0;j<8;j++){
                    if(s.charAt(j)!='.') ans += s.charAt(j);
                }
            }
            System.out.println(ans);
        }

    }
}
