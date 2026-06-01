package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1373B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int zero = 0;
            int ones = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') zero++;
                else ones++;
            }
            int operations = Math.min(zero,ones);
            if(operations % 2 ==1) System.out.println("DA");
            else System.out.println("NET");
        }
    }
}
