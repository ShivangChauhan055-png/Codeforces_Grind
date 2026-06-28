package Rating_800_Questions;

import java.util.Scanner;

public class Problem_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1));
    }
}
