package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!isvowel(ch)){
                sb.append('.');
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
    }
    static boolean isvowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='y') return true;
        return false;
    }
}
