package Rating_800_Questions;

import java.util.Scanner;

public class Problem_41A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.equals(new StringBuilder(t).reverse().toString())){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
