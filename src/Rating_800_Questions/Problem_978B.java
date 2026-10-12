package Rating_800_Questions;

import java.util.Scanner;

public class Problem_978B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0 , ans  = 0;
        for(char ch : s.toCharArray()){
            if(ch=='x') count++;
            else count = 0;
            if(count >=3) ans++;
        }

        System.out.println(ans);
    }
}
