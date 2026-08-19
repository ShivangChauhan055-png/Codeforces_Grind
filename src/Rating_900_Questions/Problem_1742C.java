package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1742C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String ans = "B";
            for(int i=0;i<8;i++){
                String s = sc.next();
                if(s.equals("RRRRRRRR")) ans = "R";
            }
            System.out.println(ans);
        }
    }
}
