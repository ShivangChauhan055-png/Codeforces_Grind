package Rating_800_Questions;

import java.util.Scanner;

public class Problem_4A {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int w = sc.nextInt();
        if(w%2==0 && w>2) System.out.println("YES");
        else System.out.println("No");
    }
}
