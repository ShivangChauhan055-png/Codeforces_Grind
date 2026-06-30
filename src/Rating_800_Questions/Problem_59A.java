package Rating_800_Questions;

import java.util.Scanner;

public class Problem_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lower = 0;
        int upper = 0;
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)) upper++;
            else lower++;
        }
        if(upper>lower) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());
    }
}
