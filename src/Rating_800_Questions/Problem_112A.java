package Rating_800_Questions;

import java.util.Scanner;

public class Problem_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // use compareToIgnoreCase instead of compareTo to avoid case-sensitivity
        if(a.compareToIgnoreCase(b) > 0) System.out.println("1");
        else if(a.compareToIgnoreCase(b)<0) System.out.println("-1");
        else System.out.println("0");
    }
}
