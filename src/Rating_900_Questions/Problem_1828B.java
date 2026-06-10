package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1828B {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int g = 0;
            for (int i = 1; i < n; i++) {
                g = gcd(g,Math.abs((i+1)-arr[i])); // becoz in ques indexing starts from 1
            }
            System.out.println(g);
        }
    }
}
