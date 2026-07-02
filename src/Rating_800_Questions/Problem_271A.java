package Rating_800_Questions;

import java.util.Scanner;

public class Problem_271A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int y = sc.nextInt();
        while(true){
            y++;
            if(unique(y)){
                System.out.println(y);
                break;
            }
        }
    }
    static boolean unique(int year){
        boolean[] yaa = new boolean[10];
        while(year>0){
            int d = year%10;
            if(yaa[d]) return false;
            yaa[d] = true;
            year/=10;
        }
        return true;
    }
}
