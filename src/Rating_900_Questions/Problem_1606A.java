package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1606A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            // imp observation AB=BA m agr last char equal h to bo equal h
            // bss bahi krna h arr string chalana h and first nd last ko equal krna h
            char[] arr = s.toCharArray();
            arr[0]=arr[s.length()-1];
            System.out.println(String.valueOf(arr)); // new string explicitly banai
        }
    }
}
