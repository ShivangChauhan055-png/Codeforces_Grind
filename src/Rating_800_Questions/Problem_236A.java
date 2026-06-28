package Rating_800_Questions;

import java.util.*;
public class Problem_236A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        Set<Character> oo = new HashSet<>();
        for(char ch : s.toCharArray()){
            oo.add(ch);
        }
        int n = oo.size();
        if(n%2==1) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
