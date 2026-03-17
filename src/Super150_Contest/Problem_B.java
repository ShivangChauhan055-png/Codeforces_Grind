package Super150_Contest;

import java.util.Scanner;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {4,7,44,47,74,77,447,474,477,744,747,774,777};
        boolean lucky_number = false;
        for(int m:arr){
            if(n%m==0){
                lucky_number=true;
                break;
            }
        }
        if(lucky_number) System.out.println("YES");
        else System.out.println("NO");
    }
}
